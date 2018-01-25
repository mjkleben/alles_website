#alles, the simplest user-friendly macro user
import os
import urllib
import json as m_json
import browser_actions, create_macro, edit_macro #other python files
from browser_actions import googler, browser_commands


#--------------------------------------------------------------
def home():
    print("*******Welcome to alles, the simple macro maker and action-performer!*******")
    print("Enter the command you wish to do (there are multiple options the same command.")
    print("-------------------Browser Commands-------------------")
    browser_commands_list = ["Google Commands: '/g' '/google' '/googler'", "YouTube Commands: '/y' '/youtube' '/yt'", "Email Commands: '/e' '/email'" , "Download Music: '/m' '/download' '/dm'"]
    for stuff in browser_commands_list:
        print(stuff)
    print("--------------Macro Commands-------------------------")
    print("Create New Macro: '/nm' '/newmacro'")
    print("Edit Existing Macro: '/em' '/editmacro'")
    print("-----------------Additional Commands------------------")
    print("Quit program: '/q' '/quit")

    print("-----------------------------------------------------\n")
    print("Enter a command: \n")

    #make the browser command just a regular command function in its own separate file
    option_answer = input()
    while(option_answer.strip() != "/q") or (option_answer.strip() != "/quit"):
        browser_commands(option_answer.strip())
        os.system('cls')
        option_answer = input("Enter a command: ")

home()

