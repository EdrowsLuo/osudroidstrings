# ¿Cómo usar el archivo skin.json?

Traducido del Ingles al Español por KousakaGoals (Papika), con asistencia y ayuda del equipo Chino de desarrollo de osu!droid.

## Introducción
El archivo skin.json es el remplazo del skin.ini después de que la versión 1.6.7 fuese introducida, este archivo tiene la característica de ser versátil a su uso.
Como su nombre lo dice, la información almacenada en este archivo será en el formato .json, la cual puede ser editable usando NotePad/TextEdit.


## Archivo de ejemplo
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
## ¿Cómo usarlo?
Todos los elementos skinneables están separados en diferentes categorías: <br> 
ComboColor, Slider, Utilities, Layout, Color<br>

### ComboColor (Color del combo)
Establece variaciones de color para un conjunto de notas (Combo).<br>

| Etiqueta | Tipo de Etiqueta | Valor por defecto | Descripcion de la Etiqueta |
|----------|------------------|------------------ | -------------------------- |
| forceOverride | Boolean | False | Cuando se cambia a "True" esta etiqueta permitira personalizar el color de un conjunto de notas (Combo), cuando se cambia a "False" sera igual al juego original (Por defecto).|
| Colors | Color hex string set | Ninguno | El color en codigo hexadecimal para un set (Combo) especifico. |

### Slider (Deslizante)
Etiquetas editables relacionado a los sliders (Deslizantes)

| Etiqueta | Tipo de Etiqueta | Valor por defecto | Descripcion de la Etiqueta |
|----------|------------------|------------------ | -------------------------- |
| sliderBodyWidth | Decimal | 61 | Establece el valor predeterminado (61) para mantener el ancho del cuerpo del slider (Deslizante). |

