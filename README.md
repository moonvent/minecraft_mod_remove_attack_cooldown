# Remove Attack Cooldown (RAC)

---

## Description

This mod remove cooldown after attack

Thank you for your attention and enjoy using my mod! If you have any suggestions for other features that could be added to make the mod even more convenient and user-friendly, please feel free to share them with me in a private message. I am always open to feedback and suggestions. Let's keep the conversation respectful and avoid violating any of the website's rules or global laws. 

---

## README (Some interested advices)

You can configurate the mod, exactly if you want to add a little balance (for example reduce a fast attack for axes, cause in vanila axes a little stronger then swords, and it can be less comfortable)

`your_minecraft_folder/config/remove_attack_cooldown.cfg`

and you can with OPENED minecraft change the config, re-enter in the world (if you change it in the world) and see, that's you changes is apply! It's so comfortable feature for configure mod (and for tests exactly :-) ), and you can play with some settings without reload a full minecraft.

---

## Config file and doc to them

```
#[HPHUP]
#Mod configuration file
#
#This config sets a few detail which help you tailor the mod more for your playstyle,
#below, I have describe a several fields and all possible values for them,
#this documentation should help you in configuring the mod;
#Happy configuring :)
#
#==================================================
#
#outputIndicatorMode - mod has 3 different modes to output you amount of entity health:
#
#  Available values:
#    1) currentHP - display amount of current entity HP, default value for parametr
#      Example:
#      10
#    2) currentWithMaxHP - display current hp, slash, max hp
#      Example:
#        10 / 20
#    3) currentPercentageHP - display amount of entity hp in percentage
#      Example:
#        50%
#
#searchDistance - How far (in blocks) mod will be search entity for display amount of HP
#  Available values:
#
#    Positive Integer, 1 - 100, if set someting wrong
#  Example:
#    20
#
#indicatorColor - Color of indicator, I try a several colors, and find that pink :)
#  is more suitable for most cases, but, if you think otherwise and have a suitable replacement, let me know.
#  Our staff of one employee will check it, and if necessary, change the default color
#
#  Available values:
#    Any color in hex view, for example, and by default sets FFAFFF
#  Example:
#    FFAFFF
#
#indicatorPosition - Indicator position, now, in relation from crosshair
#
#  Available values:
#    LEFT_UPPER_NEAR_CROSSHAIR, RIGHT_UPPER_NEAR_CROSSHAIR, LEFT_BOTTOM_NEAR_CROSSHAIR, RIGHT_BOTTOM_NEAR_CROSSHAIR,
#    RIGHT_NEAR_CROSSHAIR, TOP_NEAR_CROSSHAIR, BOTTOM_NEAR_CROSSHAIR, LEFT_NEAR_CROSSHAIR
#  Example:
#    LEFT_UPPER_NEAR_CROSSHAIR
#
#warningAfterPressMenuKey - a warning in chat, which appear when press not complete keybind for open configuration of menu
#
#  Available values:
#    1, 0
#  Example:
#    1
#
#greetingsAfterEnterInWorld - greetings in chat, after enter in the world
#
#  Available values:
#    1, 0
#  Example:
#    1
#
#Final default config example seem like that:
#
#indicatorColor=FFAFFF
#indicatorPosition=LEFT_UPPER_NEAR_CROSSHAIR
#outputIndicatorMode=currentHP
#greetingsAfterEnterInWorld=1
#warningAfterPressMenuKey=1
#searchDistance=20
#
#If something went wrong, you are set the wrong type of parametr or wrong parametr,
#mod will be use default value, which describe in a config example above
#
#Thank you for playing with this mod!
#
#Sat Feb 03 15:54:00 CET 2024
greetingsAfterEnterInWorld=1
indicatorColor=FFAA99
indicatorPosition=LEFT_BOTTOM_NEAR_CROSSHAIR
outputIndicatorMode=currentWithMaxHP
searchDistance=30
warningAfterPressMenuKey=0
```
---

## Little offtop about mod

After 5 year of not playing in minecraft, I return to it and understand that official developers make some global updates but all this updates not interested for me :( And one update with cooldown of attack I exactly didn't like. And because of that, I create this mod.

---
