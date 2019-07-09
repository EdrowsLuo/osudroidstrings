# 如何使用skin.json

## 简介
skin.json是在1.6.7版本后新出现的skin.ini的替代品，具有比skin.ini更加灵活的特性。
正如其名，数据的以json的格式存储的，可以直接用任何文本编辑器编辑。


## 示例文件
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
## 如何使用
所有的可编辑属性被分为了几个不同的类别：<br>
ComboColor, Slider, Utils, Layout, Color<br>

### ComboColor
设置note组的颜色变化<br>

| 属性id | 属性类型、默认值 | 属性描述 |
|-------------|------ | ------------------------------- |
| forceOverride | 布尔值/false  | 设置为true时可以启用这个设置来自定义note组的颜色，false时和游戏内设置的一样 |
| colors | 颜色字符串数组/无 | 具体的一组颜色值|

### Slider
设置滑条相关的属性

| 属性id | 属性类型、默认值 | 属性描述 |
|-------------|------ | ------------------------------- |
| sliderBodyWidth | 浮点数/61 | 设置滑条的默认宽度 |
| sliderBorderWidth | 浮点数/5.2 | 设置滑条边框的宽度 |
| sliderBodyBaseAlpha | 浮点数/0.7 | 设置滑条的基础透明度（不会对边框生效） |
| sliderFollowComboColor | 布尔值/false | 设置滑条是否是和当前note组的颜色同步 |
| sliderBodyColor | 颜色字符串/无 | 当不跟随note组的颜色时滑条将会使用这个颜色 |
| sliderBorderColor | 颜色字符串/无 | 设置滑条边框的颜色 |
| sliderHintEnable | 布尔值/false | 是否开启滑条提示 （当滑条达到一定长度时绘制一条额外的路径来辅助读图） |
| sliderHintAlpha | 浮点数/0.3 | 滑条提示的基础透明度 |
| sliderHintColor | 颜色字符串/无 | 滑条提示的颜色，没有设置时默认为跟随note组颜色 |
| sliderHintWidth | 浮点数/3 | 滑条提示的宽度 |
| sliderHintShowMinLength | 浮点数/300 | 显示滑条提示的最小滑条长度 |

### Utils
一些杂项设定<br>

| 属性id | 属性类型、默认值 | 属性描述 |
|-------------|------ | ------------------------------- |
| limitComboTextLength | 布尔值/false | 设置为true时当note的数字达到了9以上的时候只显示个位 |
| disableKiai | 布尔值/false | 设置为true时可以关闭kiai闪光 |

### Colors
一些关于布局的颜色设定<br>
属性都是颜色字符串，默认都是空（跟随游戏默认）

| 属性id | 属性描述 |
|------------ | ------------------------------- |
| MenuItemDefaultColor | 选歌界面铺面集项目的背景的默认颜色 |
| MenuItemOnTouchColor | 当点击某一项时显示的背景颜色 |
| MenuItemVersionsDefaultColor | 点开铺面集显示的各个难度的背景默认颜色 |
| MenuItemVersionsSelectedColor | 被选中的难度的背景颜色 |
| MenuItemSelectedTextColor | 被选中的难度的文本颜色 |
| MenuItemDefaultTextColor | 展开的难度里没被选择的项的文本颜色 |

### Layout
一些关于ui组件的设定<br>
每一个子类里都有相同的默认属性设定<br>
示例：<br>

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
每个组件可以设置的基础属性有：

| 属性id | 属性类型、默认值 | 属性描述 |
|-------------|------ | ------------------------------- |
| w | 浮点数/-1 | 宽度，-1时为组件原本宽度 |
| h | 浮点数/-1 | 高度，-1时为组件原本高度 |
| x | 浮点数/0 | 改变组件的x值 |
| y | 浮点数/0 | 改变组件的y值 |
| scale | 浮点数/1 | 组件的大小缩放值 |

更加具体的设置在下面:<br>
**BackButton** <br>
接受常规设置，但是对x,y的设置无效<br>
 - 额外的属性：scaleWhenHold，设置为false时禁用点击back按钮时按钮的缩放<br>

**ModsButton,OptionsButton,RandomButton**<br>
接受常规设置，但是对x,y的设置无效
(这些组件的默认scale是1.5)


