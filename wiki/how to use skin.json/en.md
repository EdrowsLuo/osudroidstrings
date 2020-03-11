# How to use skin.json

Translated from Chinese to English by ImagineBlaze, with assitance from
the Chinese osu!droid closed beta development team.

## Introduction

skin.json is a skin.ini replacement after 1.6.7 is introduced, it has a
speciality of being more versatile. As it's name suggests，data will be
stored in the .json format, and can be directly edited using
NotePad/TextEdit.


## Example file

```json
{
    "ComboColor" : {
        "forceOverride" : false,
        "colors" : ["#FFFFFF"]
    },
    "Slider" : {
        "sliderFollowComboColor" : true,
        "sliderBorderColor" : "#FFFFFF",
        "sliderBodyColor" : "#555555",
        "sliderBodyBaseAlpha" : 0.7,
        "sliderHintEnable": true,
        "sliderHintAlpha" : 0.3,
        "sliderHintWidth" : 3,
        "sliderHintShowMinLength" : 300
    },
    "Utils" : {
        "limitComboTextLength" : true,
        "disableKiai" : true
    },
    "Layout" : {
        "BackButton" : {
            "scaleWhenHold" : false
        },
        "ModsButton" : {
            "scale" : 1
        },
        "OptionsButton" : {
            "scale" : 1
        },
        "RandomButton" : {
            "scale" : 1
        }
    },
    "Color" : {
        "MenuItemDefaultColor" : "#52A7FA",
        "MenuItemVersionsDefaultColor" : "#01CAFF",
        "MenuItemSelectedTextColor" : "#FFFFFF",
        "MenuItemDefaultTextColor" : "#DDDDDD"
    }
}
```

## How to use

All skinnable elements are separated into a few different
catagories：<br> ComboColor, Slider, Utilities, Layout, Color<br>

### ComboColor

Setting note set's color variations<br>

| Characteristic id | Characteristic type, default value | Characteristic description                                                                                                                                 |
|:------------------|:-----------------------------------|:-----------------------------------------------------------------------------------------------------------------------------------------------------------|
| forceOverride     | Boolean/false                      | When set to true, this setting will be enabled to customize the note set's colour，when it's set to false, it will be similar to what's originally in-game |
| colors            | Color hex string set/None          | The color hex code for a specific set                                                                                                                      |

### Slider

Characteristics settings related to sliders

| Characteristic id       | Characteristic type、Default value | Characteristic description                                                                                                                                                 |
|:------------------------|:-----------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| sliderBodyWidth         | Decimal/61                         | Setting the deafult value for the sldierbody's width                                                                                                                      |
| sliderBorderWidth       | Decimal/5.2                        | Setting the sliderborder's width                                                                                                                                          |
| sliderBodyBaseAlpha     | Decimal/0.7                        | Setting the sliderbody's base transparency（Does not affect the sliderborder）                                                                                             |
| sliderFollowComboColor  | Boolean/false                      | Setting if the slider will follow the current note set's color or not                                                                                                     |
| sliderBodyColor         | Color hex/None                     | Sliders will use this color instead if they are set not to follow                                                                                                         |
| sliderBorderColor       | Color hex/None                     | Setting the sliderborder's color                                                                                                                                          |
| sliderHintEnable        | Boolean/false                      | Turn On or Off the slider hint （When sliders exceed a set length, the sliderbody will be indicated clearly with an additional line down the middle of the slider's path） |
| sliderHintAlpha         | Decimal/0.3                        | Base transparency for the slider hint                                                                                                                                     |
| sliderHintColor         | Color hex/None                     | Color of the slider hint，when it is not set, it will default to follow the current note set's color                                                                       |
| sliderHintWidth         | Decimal/3                          | Width of the slider hint                                                                                                                                                  |
| sliderHintShowMinLength | Decimal/300                        | The minimal length a slider must exceed for it to show a slider hint                                                                                                      |

### Utilities

Some miscellaneous settings <br>

| Characteristic id    | Characteristic type, default value | Characteristic description                                                    |
|:---------------------|:-----------------------------------|:------------------------------------------------------------------------------|
| limitComboTextLength | Boolean/false                      | When set to true, only the first digit will show for any combo number above 9 |
| disableKiai          | Boolean/false                      | Kiai flashes can be turned off when this is set to true                       |

### Colors

Some color settings related to layouts <br> Characteristics are all
color hex codes，all default values are blank（As the game defaults to）

| Characteristic id             | Characteristic description                                                          |
|:------------------------------|:------------------------------------------------------------------------------------|
| MenuItemDefaultColor          | In the songs selection page, each mapset's background's default color               |
| MenuItemOnTouchColor          | The background color displayed when an item is tapped on                            |
| MenuItemVersionsDefaultColor  | The default background color displayed on each difficulty when a mapset is selected |
| MenuItemVersionsSelectedColor | The background color for a selected difficulty                                      |
| MenuItemSelectedTextColor     | The text color for a difficulty selected                                            |
| MenuItemDefaultTextColor      | The text color of the difficulties not selected in a selected mapset                |

### Layout

Some settings about the UI elements <br> All minor types have similar
default characteristic settings <br> Example：<br>

```json
"Layout" : {
    "BackButton" : {
        "scaleWhenHold" : false
    },
    "ModsButton" : {
        "scale" : 1
    },
    "OptionsButton" : {
        "scale" : 1
    },
    "RandomButton" : {
        "scale" : 1
    }
}
```

Every item that can be changed have base characteristics like：

| Characteristic id | Characteristic type、Default value | Characteristic description               |
|:------------------|:-----------------------------------|:-----------------------------------------|
| w                 | Decimal/-1                         | Width，-1 is the item's original width   |
| h                 | Decimal/-1                         | Height，-1 is the item's original height |
| x                 | Decimal/0                          | Change item's X value                    |
| y                 | Decimal/0                          | Change item's Y value                    |
| scale             | Decimal/1                          | Scale value for the item's size          |

More specific settings are below:<br> **BackButton** <br> Accepts
conventional settings，but settings to X and Y has no effect<br>
- Additional characteristic：scaleWhenHold，When set to false, the back
  button's zoom when tapped will be disabled <br>

**ModsButton,OptionsButton,RandomButton**<br> Accepts conventional
settings，but settings to X and Y has no effect (These item's default
scale is 1.5)
