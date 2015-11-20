#Project 1
## Sorting 6 numbers 

##Introduction
This is code that uses a for loop, a custom method call and an array. 
This process is used in eclipse and through github.

##References and Literature

##Code
```java
		public class Arrays {
		public static void main(String[] args) {
		System.out.println("Hello Kylie, this is a sorting algorithm using arrays.");
		
		// call the sorting algorithm
		SortAlgorithm();
		}
		
		public static void SortAlgorithm() {

		// generate a set of random numbers for sorting
		int mylistsize = 6;
		int[] ArrayNumber = new int[mylistsize];
		ArrayNumber = buildRandomArray(mylistsize);
		System.out.print("The random array is: ( ");
		for (int i = 0; i < mylistsize; i++ ){
			System.out.print(ArrayNumber[i] + " ");
		}
		System.out.println(").");
		
		
		// sort the array of numbers
		ArrayNumber = sortOurArray(ArrayNumber, mylistsize);
		System.out.print("The sorted array is: ( ");
		for (int i = 0; i < mylistsize; i++ ){
			System.out.print(ArrayNumber[i] + " ");
		}
		
		System.out.println(").");
		
		}
		
		public static int[] buildRandomArray(int mylistsize) {
		int[] ArrayNumber = new int[mylistsize];
		// populate the array
		ArrayNumber = populateRandomArray(ArrayNumber, mylistsize);
		
		// Test the array to see if there are duplicates.
		
		return ArrayNumber;
		}
		
		public static int[] populateRandomArray(int[] ArrayNumber, int mylistsize) {
		
		int randomRange = mylistsize * 1000;
		for (int i = 0; i < mylistsize; i++ ){
			ArrayNumber[i] = (int)(Math.random()*randomRange);
		}
		
		return ArrayNumber;
		
		}
	
		public static int[] sortOurArray(int[] ArrayNumber, int mylistsize) {
		
		int Number1;
		int Number2;
		for (int passCounter = 1; passCounter <= mylistsize; passCounter++ ){
			
			for (int i = 0; i < mylistsize-1; i++ ){
				
				Number1 = ArrayNumber[i];
				Number2 = ArrayNumber[i+1];
				
				if(Number2 < Number1){
					ArrayNumber[i] = Number2;
					ArrayNumber[i+1] = Number1;
				}
				}
				}
				return ArrayNumber;
				}
				}

```

##Console Output
```java
Hello Kylie, this is a sorting algorithm using arrays.
The random array is: ( 579 505 4009 4224 2041 4944 ).
The sorted array is: ( 505 579 2041 4009 4224 4944 ).
```

##Command Prompt
Microsoft Windows [Version 6.1.7601]
Copyright (c) 2009 Microsoft Corporation.  All rights reserved.

C:\Users\LAB>E:

E:\>dir
 Volume in drive E is STORE N GO
 Volume Serial Number is 0012-D687

 Directory of E:\

10/13/2015  07:36 PM    <DIR>          Workspace
02/06/2015  07:43 AM    <DIR>          College Assignments
02/06/2015  07:43 AM    <DIR>          Senior Pictures
10/05/2015  06:50 PM    <DIR>          IF FOUND, OPEN ME
11/09/2015  09:41 AM    <DIR>          Methods
11/09/2015  09:41 AM    <DIR>          MandLoops
11/19/2015  06:08 PM    <DIR>          Arrays
               0 File(s)              0 bytes
               7 Dir(s)   3,537,096,704 bytes free

E:\>cd Arrays

E:\Arrays>dir
 Volume in drive E is STORE N GO
 Volume Serial Number is 0012-D687

 Directory of E:\Arrays

11/19/2015  06:08 PM    <DIR>          .
11/19/2015  06:08 PM    <DIR>          ..
11/19/2015  06:08 PM    <DIR>          .metadata
11/19/2015  06:09 PM    <DIR>          Arrays
11/19/2015  07:09 PM    <DIR>          .recommenders
               0 File(s)              0 bytes
               5 Dir(s)   3,537,096,704 bytes free

E:\Arrays>cd Arrays

E:\Arrays\Arrays>dir
 Volume in drive E is STORE N GO
 Volume Serial Number is 0012-D687

 Directory of E:\Arrays\Arrays

11/19/2015  06:09 PM    <DIR>          .
11/19/2015  06:09 PM    <DIR>          ..
11/19/2015  06:09 PM               382 .project
11/19/2015  06:09 PM    <DIR>          src
11/19/2015  06:09 PM    <DIR>          bin
11/19/2015  06:09 PM               232 .classpath
               2 File(s)            614 bytes
               4 Dir(s)   3,537,096,704 bytes free

E:\Arrays\Arrays>git config user.name "kylielent"

E:\Arrays\Arrays>git config user.email "lentk@student.swosu.edu"

E:\Arrays\Arrays>echo # SortingNumbers >> README.md

E:\Arrays\Arrays>git init
Initialized empty Git repository in E:/Arrays/Arrays/.git/

E:\Arrays\Arrays>git add README.md

E:\Arrays\Arrays>git commit -m "first commit"
[master (root-commit) 4e69959] first commit
 1 file changed, 1 insertion(+)
 create mode 100644 README.md

E:\Arrays\Arrays>git remote add origin https://github.com/kylielent/SortingNumbe
rs.git

E:\Arrays\Arrays>git push -u origin master
Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Counting objects: 3, done.
Writing objects: 100% (3/3), 232 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/kylielent/SortingNumbers.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

E:\Arrays\Arrays>git add .

E:\Arrays\Arrays>git commit -m "got code working."
[master f6b1d57] got code working.
 4 files changed, 108 insertions(+)
 create mode 100644 .classpath
 create mode 100644 .project
 create mode 100644 bin/Arrays.class
 create mode 100644 src/Arrays.java

E:\Arrays\Arrays>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Counting objects: 8, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (6/6), done.
Writing objects: 100% (8/8), 2.50 KiB | 0 bytes/s, done.
Total 8 (delta 0), reused 0 (delta 0)
To https://github.com/kylielent/SortingNumbers.git
   4e69959..f6b1d57  master -> master

E:\Arrays\Arrays>git pull
Already up-to-date.

E:\Arrays\Arrays>git add .

E:\Arrays\Arrays>git commit -m "got code working and cleaned it up. all done"
[master f1c67d1] got code working and cleaned it up. all done
 2 files changed, 75 insertions(+), 85 deletions(-)
 rewrite src/Arrays.java (67%)

E:\Arrays\Arrays>git push
warning: push.default is unset; its implicit value has changed in
Git 2.0 from 'matching' to 'simple'. To squelch this message
and maintain the traditional behavior, use:

  git config --global push.default matching

To squelch this message and adopt the new behavior now, use:

  git config --global push.default simple

When push.default is set to 'matching', git will push local branches
to the remote branches that already exist with the same name.

Since Git 2.0, Git defaults to the more conservative 'simple'
behavior, which only pushes the current branch to the corresponding
remote branch that 'git pull' uses to update the current branch.

See 'git help config' and search for 'push.default' for further information.
(the 'simple' mode was introduced in Git 1.7.11. Use the similar mode
'current' instead of 'simple' if you sometimes use older versions of Git)

Username for 'https://github.com': kylielent
Password for 'https://kylielent@github.com':
Counting objects: 6, done.
Delta compression using up to 4 threads.
Compressing objects: 100% (4/4), done.
Writing objects: 100% (6/6), 885 bytes | 0 bytes/s, done.
Total 6 (delta 3), reused 0 (delta 0)
To https://github.com/kylielent/SortingNumbers.git
   f6b1d57..f1c67d1  master -> master

E:\Arrays\Arrays>

##Summary
The purpose of this assignment...


# Project 2
## The addition game

##Introduction

##References and Literature

##Code
```java
```

##Console
```java
```

##Command Prompt


##Summary


