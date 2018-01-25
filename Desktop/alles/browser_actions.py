import urllib
from bs4 import BeautifulSoup
import re, os, webbrowser,requests #for Google
import urllib.request, urllib.parse #for Youtube
import bs4
import smtplib #for emails
import sys, time
import create_macro, edit_macro


every_command = ["/g","/google", "/googler","/y", "/youtube", "/yt","/e", "/email", "/q", "/quit"]
def browser_commands(inputted_command):
    #Google caller
    google_commands = ["/g","/google", "/googler"]
    youtube_commands = ["/y", "/youtube", "/yt"]
    email_commands = ["/e", "/email"]

    if inputted_command in google_commands:
        os.system('cls')  # clear the screen of existing text
        googler()
    elif inputted_command in youtube_commands:
        os.system('cls')  # clear the screen of existing text
        youtuber()
    elif inputted_command in email_commands:
        os.system('cls')  # clear the screen of existing text
        email_sender()
    elif inputted_command == "/quit" or inputted_command == "/q":
        print("Quitting the program..")
        time.sleep(2)
        sys.exit(0)
    else:
        print("Please enter a valid command.")

#-----------------------------------------------------------------GOOGLE--------------------------------------------------------------
def googler(): #opens a google page in a new window
    search = input("Google: ")
    if search.strip() in every_command:
        for i in every_command:
            if search == i:
                browser_commands(search)
                break
    elif search.strip() == "/help":
        google_help()
    print("Searching on Google...")

    #How many tabs should be open? Code
    how_many_tabs = 1
    list = []
    if not re.findall(r'\+\+(\w+)', search):
        print("Finding top result for " + "'" + search + "'"+ " ...")
    if re.findall(r'\+\+(\w+)', search):
        list = re.findall(r'\+\+(\w+)', search)
        if int(list[0]):
            how_many_tabs = int(list[0])
            search, separator, old_string = search.partition('++' + list[0])
            print("Finding top " + str(how_many_tabs) + " results for " + "'" + search + "'" + " ...")

    #Opening the tabs
    res = requests.get('https://google.com/search?q=' + search)
    soup = bs4.BeautifulSoup(res.text, 'lxml')
    links = soup.select('.r a')
    num_tabs = min(how_many_tabs, len(links))

    for i in range(num_tabs):
        webbrowser.open('https://google.com' + links[i].get('href'))

    os.system('cls')  # clear the screen of existing text
    another_command = input("Enter a command: ")
    browser_commands(another_command)

def google_help():
    print("Welcome to the Googler!")
    print("\nEnter what you want to search to get the top search result on Google.")
    print("You can also add a '++#' after your search, where # is the number of top search results you want.")
    command = input("Type '/g' to go back to the Google page or Enter a command: \n")
    browser_commands(command)

#-------------------------------------------------YOUTUBE-------------------------------------------------
def youtuber(): #opens a youtube video
    youtube_commands = ["/y", "/youtube", "/yt"]
    print("Welcome to YouTuber!")

    vid_search = input("What's the name of the video you'd like to search for? \n")

    query_string = urllib.parse.urlencode({"search_query": vid_search})
    html_content = urllib.request.urlopen("http://www.youtube.com/results?" + query_string)
    search_results = re.findall(r'href=\"\/watch\?v=(.{11})', html_content.read().decode())

    top_result = "http://www.youtube.com/watch?v=" + search_results[0]
    webbrowser.open_new_tab(top_result)

    correct_or_no = input("Is this video what you were looking for? Y or N \n") #is the opened tab correct, if not then close it and open the whole YouTube page
    if correct_or_no == "y" or correct_or_no == "Y":
        pass
    elif correct_or_no == "n" or correct_or_no == "N":
        webbrowser.open_new_tab("http://www.youtube.com/results?" + query_string)
    else:
        browser_commands(correct_or_no)

    os.system('cls')  # clear the screen of existing text
    another_command = input("Enter a command: ")
    browser_commands(another_command)
#-------------------------------------------EMAIL----------------------------------------------------------------
def email_sender():
    email_commands = ["/e", "/email"]
    print("Welcome to the Emailer! Enter your login and password (info will be saved to a file so you won't have to log in again)")

    try:
        username = input("Email username : ")
        password = input("Email password: ")

        send_to = input("Send to: ")

        subject = input("Subject: ")
        content = input("Content: \n")

        message = 'Subject: {}\n\n{}'.format(subject, content)

        stmp_email = ""
        email_org = ""
        if "@hotmail.com" in username:
            stmp_email = 'smtp.live.com'
            email_org = "@hotmail.com"
        elif "@gmail.com" in username:
            stmp_email = 'smtp.gmail.com'
            email_org = '@gmail.com'


        email = smtplib.SMTP(stmp_email, 587)
        email.ehlo()
        email.starttls()
        email.login(username, password)

        email_address = username + email_org
        email_outline(username, send_to, subject, content) #check to see if user wants to send mail or not

        if  email_outline(username, send_to, subject, content)  == True:
            email.sendmail(email_address, send_to, message)
            email.quit()
            print("Email sent!")
            enter_command()
        elif email_outline(username, send_to, subject, content)  == False:
            email.quit()
            print("Email deleted.")
            enter_command()
        else:
            enter_command()

    except:
        print("Please check all email addresses")
        command = input("Type /help to see list of possible problems")
        if command == "/help":
            email_help()
        else:
            browser_commands(command)



def email_help():
    print("1. If using Gmail -> My Account -> Sign-in & security. Make 'Allow less secure apps: ON'")
    print("2. Make sure you wrote the full email address. Example: 'foo@gmail.com' instead of just 'foo'.")
    print("3. Check to see if you typed your password, all emails, etc. correctly.")
    enter_command()

def email_outline(email_address, send_to, subject, content ):
    print("------------------EMAIL PREVIEW------------------")
    print("From: " + email_address)
    print("To: " + send_to)
    print("Subject: " + subject)
    print("Content: " + content)
    print("-------------------------------------------------")

    answer = input("Send email? Y or N")

    while(answer not in every_command):
        if answer == "Y" or answer == "y":
            return True
        elif answer == "N" or answer == "n":
            return False
        else:
            print("Enter a valid response or Enter a command..")

    if answer in every_command:
        browser_commands(answer)
#---------------------------------------------------------------------------------------------------------------------
def login_open_tab(): #opens the tab in a new window already logged in
    pass


#---------------------------------------------------------------------------------------------------------------------
def music_downloader(): #downloads music given a youtube link
    music_commands = ["/music", "/m"]
    pass

#---------------------------------------------------------------------------------------------------------------------
def enter_command():
    command = input("Enter a command: \n")
    browser_commands(command)