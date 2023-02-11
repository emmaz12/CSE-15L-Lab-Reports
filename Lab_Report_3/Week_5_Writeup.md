CSE 15L Week 5 Lab Report
---
During the last two weeks, we worked on learning and using different bash commands such as find, grep, less etc. Using these commands, we applied them during the skill demo.

Part 1: not option
---
Using this option, the find command searches for file names that do not have the specified string within them. The two examples below demonstrate using find within the written_2 directory of the skill-demo1-data directory:

**Example 1**

Input:

`Emmas-Macbook-Pro-14:skill-demo1-data emmaz$ find written_2 -not -name "*.txt"`

Output:
```
written_2
written_2/non-fiction
written_2/non-fiction/OUP
written_2/non-fiction/OUP/Berk
written_2/non-fiction/OUP/Abernathy
written_2/non-fiction/OUP/Rybczynski
written_2/non-fiction/OUP/Kauffman
written_2/non-fiction/OUP/Fletcher
written_2/non-fiction/OUP/Castro
written_2/travel_guides
written_2/travel_guides/berlitz1
written_2/travel_guides/berlitz2
```

As seen in the code block above, the command is searching within the written_2 directory and looking for all paths that don't contain the string ".txt" within them. As such, the above directory paths are returned. This would be useful to see what the directories within written_2 are without using temporary files etc. 

**Example 2**

Input: 

`Emmas-Macbook-Pro-14:skill-demo1-data emmaz$ find written_2 -not -name "*a*"`

Output:
```
written_2
written_2/non-fiction
written_2/non-fiction/OUP
written_2/non-fiction/OUP/Berk
written_2/non-fiction/OUP/Berk/ch2.txt
written_2/non-fiction/OUP/Berk/ch1.txt
written_2/non-fiction/OUP/Berk/CH4.txt
written_2/non-fiction/OUP/Berk/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch2.txt
written_2/non-fiction/OUP/Abernathy/ch3.txt
written_2/non-fiction/OUP/Abernathy/ch1.txt
written_2/non-fiction/OUP/Abernathy/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch6.txt
written_2/non-fiction/OUP/Abernathy/ch8.txt
written_2/non-fiction/OUP/Abernathy/ch9.txt
written_2/non-fiction/OUP/Abernathy/ch15.txt
written_2/non-fiction/OUP/Abernathy/ch14.txt
written_2/non-fiction/OUP/Rybczynski
written_2/non-fiction/OUP/Rybczynski/ch2.txt
written_2/non-fiction/OUP/Rybczynski/ch3.txt
written_2/non-fiction/OUP/Rybczynski/ch1.txt
written_2/non-fiction/OUP/Kauffman/ch3.txt
written_2/non-fiction/OUP/Kauffman/ch1.txt
written_2/non-fiction/OUP/Kauffman/ch4.txt
written_2/non-fiction/OUP/Kauffman/ch5.txt
written_2/non-fiction/OUP/Kauffman/ch7.txt
written_2/non-fiction/OUP/Kauffman/ch6.txt
written_2/non-fiction/OUP/Kauffman/ch8.txt
written_2/non-fiction/OUP/Kauffman/ch9.txt
written_2/non-fiction/OUP/Kauffman/ch10.txt
written_2/non-fiction/OUP/Fletcher
written_2/non-fiction/OUP/Fletcher/ch2.txt
written_2/non-fiction/OUP/Fletcher/ch1.txt
written_2/non-fiction/OUP/Fletcher/ch5.txt
written_2/non-fiction/OUP/Fletcher/ch6.txt
written_2/non-fiction/OUP/Fletcher/ch9.txt
written_2/non-fiction/OUP/Fletcher/ch10.txt
written_2/non-fiction/OUP/Castro/chR.txt
written_2/non-fiction/OUP/Castro/chP.txt
written_2/non-fiction/OUP/Castro/chQ.txt
written_2/non-fiction/OUP/Castro/chB.txt
written_2/non-fiction/OUP/Castro/chC.txt
written_2/non-fiction/OUP/Castro/chA.txt
written_2/non-fiction/OUP/Castro/chV.txt
written_2/non-fiction/OUP/Castro/chW.txt
written_2/non-fiction/OUP/Castro/chM.txt
written_2/non-fiction/OUP/Castro/chZ.txt
written_2/non-fiction/OUP/Castro/chL.txt
written_2/non-fiction/OUP/Castro/chN.txt
written_2/non-fiction/OUP/Castro/chY.txt
written_2/non-fiction/OUP/Castro/chO.txt
written_2/travel_guides/berlitz1
written_2/travel_guides/berlitz1/HistoryEgypt.txt
written_2/travel_guides/berlitz1/IntroEdinburgh.txt
written_2/travel_guides/berlitz1/IntroDublin.txt
written_2/travel_guides/berlitz1/WhereToGreek.txt
written_2/travel_guides/berlitz1/HistoryDublin.txt
written_2/travel_guides/berlitz1/HistoryHongKong.txt
written_2/travel_guides/berlitz1/IntroLosAngeles.txt
written_2/travel_guides/berlitz1/HistoryGreek.txt
written_2/travel_guides/berlitz1/WhereToEgypt.txt
written_2/travel_guides/berlitz1/WhereToEdinburgh.txt
written_2/travel_guides/berlitz1/WhereToDublin.txt
written_2/travel_guides/berlitz1/IntroHongKong.txt
written_2/travel_guides/berlitz1/IntroFWI.txt
written_2/travel_guides/berlitz1/IntroGreek.txt
written_2/travel_guides/berlitz1/WhereToLosAngeles.txt
written_2/travel_guides/berlitz1/HistoryEdinburgh.txt
written_2/travel_guides/berlitz1/HistoryFWI.txt
written_2/travel_guides/berlitz1/IntroEgypt.txt
written_2/travel_guides/berlitz1/WhereToHongKong.txt
written_2/travel_guides/berlitz1/WhereToFWI.txt
written_2/travel_guides/berlitz2
written_2/travel_guides/berlitz2/Berlin-WhereToGo.txt
written_2/travel_guides/berlitz2/Boston-WhereToGo.txt
written_2/travel_guides/berlitz2/Berlin-History.txt
written_2/travel_guides/berlitz2/Crete-WhereToGo.txt
written_2/travel_guides/berlitz2/Athens-History.txt
written_2/travel_guides/berlitz2/Athens-WhereToGo.txt
written_2/travel_guides/berlitz2/PuertoRico-History.txt
written_2/travel_guides/berlitz2/Crete-History.txt
written_2/travel_guides/berlitz2/PuertoRico-WhereToGo.txt
written_2/travel_guides/berlitz2/Beijing-History.txt
written_2/travel_guides/berlitz2/Athens-Intro.txt
written_2/travel_guides/berlitz2/Beijing-WhereToGo.txt
```

In this example, the output is all the paths within written_2 that don't have the letter "a" within the last location of the path AKA the section after the last "/". However, this is case-sensitive and the letter "A" would still be returned as a valid path. Having this is useful perhaps if you want look for a file through elimination and the file you're looking for doesn't have an "a" in it for instance. Of course, the letter "a" could be replaced by a more specific string for a more specific search. In the case of written_2, there are a lot of files and I didn't want my output to be too long to paste into the report.

**Source**
The source I used to learn about the -not option is the following [Link](https://math2001.github.io/article/bashs-find-command/)


Part 2: type f option
---
When using this option, only the elements of type f would be returned. The type f is a file. Thus, only files will be returned and not directories.
 
**Example 1**

Input: 

`Emmas-Macbook-Pro-14:skill-demo1-data emmaz$ find written_2/non-fiction/OUP/Abernathy/ -type f`

Output:
```
written_2/non-fiction/OUP/Abernathy/ch2.txt
written_2/non-fiction/OUP/Abernathy/ch3.txt
written_2/non-fiction/OUP/Abernathy/ch1.txt
written_2/non-fiction/OUP/Abernathy/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch6.txt
written_2/non-fiction/OUP/Abernathy/ch8.txt
written_2/non-fiction/OUP/Abernathy/ch9.txt
written_2/non-fiction/OUP/Abernathy/ch15.txt
written_2/non-fiction/OUP/Abernathy/ch14.txt
```

In this example, the -type f command is used to find only files within the path of written_2/non-fiction/OUP/Abernathy. Since the type is for files, only the files in this directory are returned as the output. This would be useful if you only want to see the files within a specified path.

**Example 2**

Input: 

`Emmas-Macbook-Pro-14:skill-demo1-data emmaz$ find written_2/non-fiction -type f`

Output:
```
written_2/non-fiction/OUP/Berk/ch2.txt
written_2/non-fiction/OUP/Berk/ch1.txt
written_2/non-fiction/OUP/Berk/CH4.txt
written_2/non-fiction/OUP/Berk/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch2.txt
written_2/non-fiction/OUP/Abernathy/ch3.txt
written_2/non-fiction/OUP/Abernathy/ch1.txt
written_2/non-fiction/OUP/Abernathy/ch7.txt
written_2/non-fiction/OUP/Abernathy/ch6.txt
written_2/non-fiction/OUP/Abernathy/ch8.txt
written_2/non-fiction/OUP/Abernathy/ch9.txt
written_2/non-fiction/OUP/Abernathy/ch15.txt
written_2/non-fiction/OUP/Abernathy/ch14.txt
written_2/non-fiction/OUP/Rybczynski/ch2.txt
written_2/non-fiction/OUP/Rybczynski/ch3.txt
written_2/non-fiction/OUP/Rybczynski/ch1.txt
written_2/non-fiction/OUP/Kauffman/ch3.txt
written_2/non-fiction/OUP/Kauffman/ch1.txt
written_2/non-fiction/OUP/Kauffman/ch4.txt
written_2/non-fiction/OUP/Kauffman/ch5.txt
written_2/non-fiction/OUP/Kauffman/ch7.txt
written_2/non-fiction/OUP/Kauffman/ch6.txt
written_2/non-fiction/OUP/Kauffman/ch8.txt
written_2/non-fiction/OUP/Kauffman/ch9.txt
written_2/non-fiction/OUP/Kauffman/ch10.txt
written_2/non-fiction/OUP/Fletcher/ch2.txt
written_2/non-fiction/OUP/Fletcher/ch1.txt
written_2/non-fiction/OUP/Fletcher/ch5.txt
written_2/non-fiction/OUP/Fletcher/ch6.txt
written_2/non-fiction/OUP/Fletcher/ch9.txt
written_2/non-fiction/OUP/Fletcher/ch10.txt
written_2/non-fiction/OUP/Castro/chR.txt
written_2/non-fiction/OUP/Castro/chP.txt
written_2/non-fiction/OUP/Castro/chQ.txt
written_2/non-fiction/OUP/Castro/chB.txt
written_2/non-fiction/OUP/Castro/chC.txt
written_2/non-fiction/OUP/Castro/chA.txt
written_2/non-fiction/OUP/Castro/chV.txt
written_2/non-fiction/OUP/Castro/chW.txt
written_2/non-fiction/OUP/Castro/chM.txt
written_2/non-fiction/OUP/Castro/chZ.txt
written_2/non-fiction/OUP/Castro/chL.txt
written_2/non-fiction/OUP/Castro/chN.txt
written_2/non-fiction/OUP/Castro/chY.txt
written_2/non-fiction/OUP/Castro/chO.txt
```
In this example, a similar thing is happening in that the -type f option is being used to display all the files within a path. However, in this directory it is clear that the path specified is much more general and the command searches recursively to find all the files within written_2/non-fiction and its subdirectories. This is useful if you want to find all the files within a larger directory.

Part 3: size option
---
This option searches for files in a directory and its subdirectories based on the file size. 

**Example 1**

Input: 
`
Emmas-Macbook-Pro-14:written_2 emmaz$ find . -size +100k
`

Output:
```
./non-fiction/OUP/Berk/ch2.txt
./non-fiction/OUP/Berk/CH4.txt
./travel_guides/berlitz1/WhereToIndia.txt
./travel_guides/berlitz1/WhereToItaly.txt
./travel_guides/berlitz1/WhereToMalaysia.txt
./travel_guides/berlitz1/WhereToJapan.txt
./travel_guides/berlitz1/WhereToFrance.txt
./travel_guides/berlitz2/Portugal-WhereToGo.txt
./travel_guides/berlitz2/Canada-WhereToGo.txt
./travel_guides/berlitz2/China-WhereToGo.txt
```
In this example, all the files that are in the currrent directory of written_2 over 100 kilobytes are returned. This could be useful if you want to sort files based on size and how much storage they take up. Or, if you are looking to reduce storage, you could find the files that take up the most space and know which ones to delete to save space.

**Example 2**

Input: 
`
Emmas-Macbook-Pro-14:written_2 emmaz$ find . -name "*.txt" -size -1k
`

Output:
```
./travel_guides/berlitz1/HandRIstanbul.txt
./travel_guides/berlitz1/HandRIbiza.txt
```

In this example, we used the find -name and -size command together to search for .txt files that are less than 1 kilobyte in size. This is simliar to the previous example, however, we see that the -size command works both for files less than or greater than the specified size. This could be useful if you are searching for the smallest file that is within a directory. 

**Source**
The source I used to find this command was to ask ChatGPT about some interesting options with the find command. One of them was the size option. The link to ChatGPT is this [Link](https://chat.openai.com/chat)

Part 4: Depth option
---
This option allows the find method to control how deep the command will search within directories and their subdirectories. For instance, if a max depth of 3 is called, the find method will only return files that are furthest 3 directories from the root directory.

**Example 1**

Input: 
`
Emmas-Macbook-Pro-14:written_2 emmaz$ find . -maxdepth 2
`

Output: 
```
.
./non-fiction
./non-fiction/OUP
./travel_guides
./travel_guides/berlitz1
./travel_guides/berlitz2
```

In this example, we asked the find method to find all files and directories that are a maximum of 2 subdirectories deep within the current directoy of written_2. As such, the deepest it went was to OUP within the non-ficiton directory and berlitz1/2 within the travel_guides directory. This may be useful if you want to only see files up to a certain directory.

**Example 2**

Input: 
`
Emmas-Macbook-Pro-14:written_2 emmaz$ find . -name "*History*" -mindepth 3
`

Output:
```
./travel_guides/berlitz1/HistoryJapan.txt
./travel_guides/berlitz1/HistoryJamaica.txt
./travel_guides/berlitz1/HistoryEgypt.txt
./travel_guides/berlitz1/HistoryIsrael.txt
./travel_guides/berlitz1/HistoryIndia.txt
./travel_guides/berlitz1/HistoryItaly.txt
./travel_guides/berlitz1/HistoryDublin.txt
./travel_guides/berlitz1/HistoryFrance.txt
./travel_guides/berlitz1/HistoryMallorca.txt
./travel_guides/berlitz1/HistoryJerusalem.txt
./travel_guides/berlitz1/HistoryMadrid.txt
./travel_guides/berlitz1/HistoryHongKong.txt
./travel_guides/berlitz1/HistoryIstanbul.txt
./travel_guides/berlitz1/HistoryLasVegas.txt
./travel_guides/berlitz1/HistoryGreek.txt
./travel_guides/berlitz1/HistoryHawaii.txt
./travel_guides/berlitz1/HistoryMadeira.txt
./travel_guides/berlitz1/HistoryMalaysia.txt
./travel_guides/berlitz1/HistoryIbiza.txt
./travel_guides/berlitz1/HistoryEdinburgh.txt
./travel_guides/berlitz1/HistoryFWI.txt
./travel_guides/berlitz1/HistoryLakeDistrict.txt
./travel_guides/berlitz2/Portugal-History.txt
./travel_guides/berlitz2/Costa-History.txt
./travel_guides/berlitz2/Barcelona-History.txt
./travel_guides/berlitz2/Berlin-History.txt
./travel_guides/berlitz2/Bali-History.txt
./travel_guides/berlitz2/Athens-History.txt
./travel_guides/berlitz2/California-History.txt
./travel_guides/berlitz2/Vallarta-History.txt
./travel_guides/berlitz2/Cancun-History.txt
./travel_guides/berlitz2/CostaBlanca-History.txt
./travel_guides/berlitz2/NewOrleans-History.txt
./travel_guides/berlitz2/PuertoRico-History.txt
./travel_guides/berlitz2/Nepal-History.txt
./travel_guides/berlitz2/China-History.txt
./travel_guides/berlitz2/Canada-History.txt
./travel_guides/berlitz2/Crete-History.txt
./travel_guides/berlitz2/Amsterdam-History.txt
./travel_guides/berlitz2/Beijing-History.txt
./travel_guides/berlitz2/CanaryIslands-History.txt
./travel_guides/berlitz2/Algarve-History.txt
./travel_guides/berlitz2/Poland-History.txt
./travel_guides/berlitz2/Budapest-History.txt
./travel_guides/berlitz2/Cuba-History.txt
./travel_guides/berlitz2/Bahamas-History.txt
```

In this example, I used the -name method to find only files with the word History within them. In addition, I used the mindepth option to specify only files that are at least within berlitz1/2 and OUP. Since only files with History are specifed, no files from the OUP directory were returned. This could be useful to use alongside other options when using the find command. If you wanted to find all the files after a certain directory, the mindepth option would be useful. 

**Source**
The source I used for this option was also ChatGTP. The link is provided above as the source for part 3.

Conclusion
---
There are many options and features of the type command when using bash. As seen in the 4 parts above, the ones demonstrated within this lab report were not, type, size, and depth. 
