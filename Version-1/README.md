# Java-Calculator Version 1
Made by [Ayonstudy](https://github.com/Ayonstudy/).
## About Program
This was a project I did many years ago when learning Java. This was never made to be used for actual professional work. Of course you can still use it if you'd like. You have to compile it yourself. To start it, open your terminal and type java Calculator. It is slow as it involves writing to disk every time. Did that raise an eyebrow or startled you in confusion, well read the story of how I wrote this bellow.

## Story of how I wrote this and how it works
This program was writen many years ago when I was learning the Java programming language. This projeact in particular took quite a while to finish. At the time I wanted to make this calculator the same as my actual calculator I used at school. I used a CASIO fx-991ES 2nd Edition. Particularly I wanted to give a string of a whole math input like 6964+5*4-314*22-448/64 and expect the program to follow BODMAS to come up with the answer directly. I previously used functions like eval() in python which can take a string like "6964+5*4-314*22-448/64" and just come up with the answer. I knew nothing about POSIX implementation. Unlike Python, Java didn't have a built in eval() function. But despite this lack of eval() function in Java and my lack of knowlwdge of POSIX at the time, I had worked around it. Of course after a year long rage quit.
#### How it works:
It simply makes a new Java file, Evaluator.java, and compiles it as the compiler has posix implementation in it. Then compeval.bat is used to compile and run Evaluator. Evaluator writes the value into Answer.txt. The Calculator program then reads the Answer.txt and displays the answer.

I felt really happy and smart at the time. Of course now I know POSIX and how to implement it. But I think the solution I found at the time pretty creative.It is very slow, but for biginner programmer me at the time, that was crazy!!! It is still very buggy and isn't perfect. But for me, it is more of a piece of art and it is beautiful. Ok maybe not bueatiful, but still a piece of art.

## How to properly run it
### Prerequisites
* Java compiler + Java runtime

### How to Run:
Step 1: Compile CMDcommand.java, Calculator.java, and CalculatorGUI.java using javac
```
javac CMDcommand.java Calculator.java CalculatorGUI.java
```
Step 2: Run Calculator with the java runtime
```
java Calculator
```
## Ending notes
Try running the example I used in this README in the calculator :P
