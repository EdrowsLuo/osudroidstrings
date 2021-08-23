# Cómo usar skin.json

Traducido del inglés al español por Likver

## Introducción

skin.json es un reemplazo de skin.ini después de la actualización 1.6.7, tiene una
especialidad de ser más versátil. Como indica el nombre, los datos serán
almacenados en el formato .json, y se puede editar directamente usando un editor de texto como: Bloc de notas / TextEdit etc.


## Archivo de muestra

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

## Cómo se usa

Todos los elementos que se pueden personalizar se separan en unas pocas
categorias: <br> ComboColor, Slider, Utilities, Layout, Color<br>

### ComboColor

Configuración de variaciones de color del conjunto de notas <br>

| Identificación de la característica | Tipo de característica, valor predeterminado | Descripción característica                                                                                                                                                 |
|:------------------------|:-----------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| forceOverride     | Boolean/false                      | Cuando se establece en verdadero (true), esta configuración se habilitará para personalizar el color del conjunto de notas, cuando se establece en falso (false), será similar a lo que originalmente estaba en el juego |
| colors            | Color hex string set/None          | El código hexadecimal de color para un conjunto específico |

### Sliders

Configuraciones de características relacionadas con los sliders

| Identificación de la característica | Tipo de característica, valor predeterminado | Descripción característica                                                                                                                                                 |
|:------------------------|:-----------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| sliderBodyWidth         | Decimal/61                         | Establecer el valor predeterminado para el ancho del "sldierbody"                                                                                                                    |
| sliderBorderWidth       | Decimal/5.2                        | Establecer el ancho del slider                                                                                                                                          |
| sliderBodyBaseAlpha     | Decimal/0.7                        | Establecer la transparencia base del "sliderbody" （No afecta al "sliderborder"）                                                                                             |
| sliderFollowComboColor  | Boolean/false                      | Establecer si el slider seguirá el color del conjunto de notas actual o no                                                                                                     |
| sliderBodyColor         | Color hex/None                     | Los sliders usarán este color                                                                                                         |
| sliderBorderColor       | Color hex/None                     | Establecer el color del slider                                                                                                                                          |
| sliderHintEnable        | Boolean/false                      | Activar o desactivar la indicación del slider （Cuando los sliders superan una longitud establecida, el "sliderbody" se indicará claramente con una línea adicional en el medio de la ruta del control deslizante） |
| sliderHintAlpha         | Decimal/0.3                        | Transparencia base para la indicacion del slider                                                                                                                                     |
| sliderHintColor         | Color hex/None                     | Color de la indicación del slider, cuando no está configurado, seguirá por defecto el color del conjunto de notas actual                                                                       |
| sliderHintWidth         | Decimal/3                          | Ancho de la indicación del slider                                                                                                                                                  |
| sliderHintShowMinLength | Decimal/300                        | La longitud mínima que debe superar un slider para que muestre una indicación de slider                                                                                                      |

### Utilidades

Algunas configuraciones diversas <br>

| Identificación de la característica | Tipo de característica, valor predeterminado | Descripción característica                                                                                                                                                 |
|:---------------------|:-----------------------------------|:------------------------------------------------------------------------------|
| limitComboTextLength | Boolean/false                      | Cuando se establece en verdadero (true), solo se mostrará el primer dígito para cualquier número combinado superior a 9 |
| disableKiai          | Boolean/false                      | Los flashes Kiai se pueden apagar cuando se establece en verdadero (true)                       |

### Colores

Algunas configuraciones de color relacionadas con diseños <br> características son todas
códigos hexadecimales de color, todos los valores predeterminados están en blanco (ya que el juego lo detecta asi si no hay nada）

| Identificación de la característica | Tipo de característica, valor predeterminado | Descripción característica                                                                                                                                                 |
|:------------------------|:-----------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| MenuItemDefaultColor | En la página de selección de canciones, el color predeterminado de fondo que se muestra de cada conjunto de mapas |
| MenuItemOnTouchColor | El color de fondo que se muestra cuando se toca un elemento |
| MenuItemVersionsDefaultColor | El color de fondo predeterminado que se muestra en cada dificultad cuando se selecciona un conjunto de mapas |
| MenuItemVersionsSelectedColor | El color de fondo para una dificultad seleccionada |
| MenuItemSelectedTextColor | El color del texto para una dificultad seleccionada |
| MenuItemDefaultTextColor | El color del texto de las dificultades no seleccionadas en un conjunto de mapas seleccionado |

### Layout

Algunas configuraciones sobre los elementos de la IU <br> Todos los tipos menores tienen similares
ajustes característicos predeterminados <br> Ejemplo ： <br>

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

Todos los elementos que se pueden cambiar tienen características básicas como:

| Identificación de la característica | Tipo de característica, valor predeterminado | Descripción característica                                                                                                                                                 |
|:------------------------|:-----------------------------------|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| w | Decimal / -1 | Ancho ， -1 es el ancho original del elemento |
| h | Decimal / -1 | Altura ， -1 es la altura original del elemento |
| x | Decimal / 0 | Cambiar el valor X del elemento |
| y | Decimal / 0 | Cambiar el valor Y del elemento |
| escala | Decimal / 1 | Valor de escala para el tamaño del elemento |

A continuación se muestran configuraciones más específicas: <br> ** BackButton ** <br> Que acepta
configuraciones convencionales, pero la configuración de X e Y no tiene ningún efecto <br>
- Característica adicional: scaleWhenHold ， Cuando se establece en falso (false),
  se desactivará el zoom del boton "Back" <br>

** ModsButton, OptionsButton, RandomButton ** <br> Acepta configuraciones convencionales, pero la configuración de X e Y no tiene ningún efecto (la configuración predeterminada de estos elementos
la escala es 1,5)
