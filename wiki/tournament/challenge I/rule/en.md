# The First osu!droid Challenge Competition
In this competition, players will play maps pre-picked to gain **challenge points** and use them to unlock different levels of badges, while also participating in the global leaderboards to gain ranking rewards.  
This competition is suitable for players of all skill-levels, as participating is very simple. 

## HOW TO PARTICIPATE
Download the designated map-pack and load it into your osu!droid app. 
Play the maps online and submit your scores to be considered a participant. 
No other special steps needed. 

## COMPETITION MAPPACK
3 packs are compiled for a total of 30 maps. 
Named Beginner Set, Advanced Set, and Challenge Set. Each set has 10 maps.
There are 3 maps each in the advanced set and challenge set which has mod requirements, check out the Mod Usage section below for more information.

## COMPETITION PERIOD
The competition begins from 2020.3.14 8:00 (GMT+8) to 2020.3.30 8:00 (GMT+8), lasting 16 days. 
Any scores submitted during the match period will be accepted, while anything submitted outside of the match period will not be accepted. 

## HOW TO CHECK MY CHALLENGE SCORE
You can check the global leaderboards [here](http://ops.dgsrz.com/challenge_ranking.php)
And you can also check your own score if you have participated, or search for other player's information. 
After you [log in](http://ops.dgsrz.com/user/?action=login),
You will be able to check your recent scores, total challenge score and ranking etc on your [personal profile page](http://ops.dgsrz.com/challenge_profile.php)

## CHANGES TO THE osu!droid CLIENT
When playing the challenge mapset, the user data pop-up after submitting a score will be replaced with data specifically for challenges. 

![upload_sample.png](../img/upload_sample.png)  
The accuracy data in the screenshot will be replaced with your **challenge score**.
![upload_sample.png](../img/upload_sample.png)  
Your accuracy on the global leaderboards will also be replaced with your **challenge score** for this map.   
![version_sample.png](../img/version_sample.png)  
On the difficulty names of each map, there’s the map’s **challenge value**, required Mod, and the map’s name. 

## MOD USAGE
Except for speed decreasing mods like **Half Time** and unranked mods like **Auto**, we allow any mods to be freely used.
Unless when the map has a required mod, then you must play with this mod included in your mods.
At the same time, additional mods will not bring bonus score, or decrease your score either. (In other words, your mods will not affect your challenge score)

Hint: Using **No Fail** will not decrease your score, so you can try using it in very difficult maps to gain more score.

Hint: The game will not warn you if you’re using the correct mod of not when you play, beware that scores without the required mod(s) will not be accepted! 


## BASIC SCORE CALCULATION
### CALCULATIONS FOR A SINGLE SCORE
For this competition, every single map has been manually assigned a **challenge value**. 
The harder the map, the higher it’s **challenge value**. 
Players’ **challenge scores** will then be calculated according to their respective challenge values.   
You can roughly think that achieving 93% accuracy with not too many combo breaks will grant you 50% **challenge score** respective to the **challenge value**. 
From this, spread out **50%** of challenge value to SS (In other words all 300s, 100% accuracy) 
There’s also a bonus of **10%** challenge score in between. **Better play, higher challenge score bonus.** 

If you don't care about about the details of how scores are calculated, then perhaps you can skip the rest of this. 
Work hard and challenge yourself for a better score is the core value of this competition! 

### 总挑战值的计算
**总挑战值** = 0.8倍**Best5** + 0.2倍**Recent10**
#### Best5
**Best5**表示你最好的5个成绩的平均分，每个谱面只记一次。

#### Recent10
**Recent10**粗略的表示你最近的10个成绩的平均分，允许出现同一个谱面的成绩。
有一点小规则来防止意外的差成绩导致的最近得分过低，
因此不需要担心打出了一个很糟糕的成绩而导致要重新刷10个最近成绩。

#### Recent10的具体计算方式
当你上传一个成绩时，如果你被记录的成绩还没有10个，那么你的这个成绩当然会必被记录下来。
如果你已经记录了超过十个成绩，那么就分两种情况来讨论：
* 如果你的 **准确率高于93%** 或者你游玩的谱面的 **挑战值的1.1倍**（谱面的最高**挑战分**）
都低于你的**Best5**，那么请放心，您的**Recent10**值绝对不会降低。我们会挑选出你 **Recent100** 成绩里
最差的那一个，如果你的成绩比这个最差的还低，那么你这次的成绩将不会更新你的**Recent10**，
如果你的新成绩比这个最差的要好，那么我们会用新成绩替换掉这个最差的成绩。
* 如果你的成绩不满足上面的条件，那么将会按照时间顺序把最早记录的成绩移出**Recent10**，
并插入新成绩，如果你的新成绩不够好，那么你的**总挑战分**有可能会降低。

## 奖励
奖励分为两种，第一种奖励通过达成一定的**挑战分**来获得，对应下面的表格：

| 徽章名称 | 所需挑战分 |
|-----------|-------|
|萌新组(-)   |3.0   |
|萌新组(=)   |3.8   |
|萌新组(+)   |4.3   |
|进阶组(-)   |5.2   |
|进阶组(=)   |5.9   |
|进阶组(+)   |6.3   |
|挑战组(-)   |6.8   |
|挑战组(=)   |7.3   |
|挑战组(+)   |7.8   |
|Beyond the Limits(∞)   |8.3   |

在未来的个人主页上可以看到你所获得的徽章。

第二种奖励是总排行榜的奖励，[挑战分排行榜](http://ops.dgsrz.com/challenge_ranking.php)前三的会有特殊奖励。

## 单次成绩的具体计算方式
如果你对这个感兴趣，我默认你将会理解下面的一些符号计算。

**单次成绩挑战分** = **谱面挑战值** x (0.8 x **accPt** + 0.2 x **comboPt**)

对应的几个值的计算方式如下：

**accRate**：就是你的准确率，在0-1之间取值。  
**comboRate**：等于 **你的分数** / **Auto打出SS时候的成绩**，也是在0-1之间取值。

**accPt**：在 **accRate**=0.7时取值为0，在 **accRate** 取值为0.93时取值为1，
在 **accRate**=0.98时取值为1.05，在**accRate**=1.0时取值为1.1，其他的值均为这些相邻节点的线性插值。  
具体的计算公式为：
```python
if accRate < 0.7:
    accPt = 0
elif accRate < 0.93:
    accPt = (accRate - 0.7) / 0.23
elif accRate <  0.98:
    accPt = 1 + 0.05 * (accRate - 0.93) / 0.05
else:
    accPt = 1.05 + 0.05 * (accRate - 0.98) / 0.02
```
我们画了一张图来描述**accPt**和**accRate**的关系：  
![accPt.png](../img/accPt.png)

**comboPt**：类似**accPt**，在**comboRate**=0时**comboPt**=0，在**comboRate**=0.8时**comboPt**=1，
在**comboRate**=1时**comboPt**=1.1。  
具体的计算公式为：
```python
if comboRate < 0.8:
    comboPt = comboRate / 0.8
else:
    comboPt = 1 + 0.1 * (comboRate - 0.8) / 0.2
```
我们同样画了一张图来描述**accPt**和**accRate**的关系：  
![comboPt.png](../img/comboPt.png)
