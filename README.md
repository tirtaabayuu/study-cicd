
acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd
$ git init
Initialized empty Git repository in F:/BackEnd/project-cicd/.git/

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git pull
There is no tracking information for the current branch.
Please specify which branch you want to merge with.
See git-pull(1) for details.

    git pull <remote> <branch>

If you wish to set tracking information for this branch you can do so with:

    git branch --set-upstream-to=<remote>/<branch> master


acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git remote

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git remote add https://github.com/tirtabayu16/study-cicd.git
usage: git remote add [<options>] <name> <url>

    -f, --fetch           fetch the remote branches
    --tags                import all tags and associated objects when fetching
                          or do not fetch any tag at all (--no-tags)
    -t, --track <branch>  branch(es) to track
    -m, --master <branch>
                          master branch
    --mirror[=(push|fetch)]
                          set up remote as a mirror to push to or fetch from


acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git pull https://github.com/tirtabayu16/study-cicd.git
remote: Enumerating objects: 3, done.
remote: Counting objects: 100% (3/3), done.
remote: Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
Unpacking objects: 100% (3/3), 621 bytes | 1024 bytes/s, done.
From https://github.com/tirtabayu16/study-cicd
 * branch            HEAD       -> FETCH_HEAD

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git branch
* master

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git push origin master
fatal: 'origin' does not appear to be a git repository
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git remote add origin https://github.com/tirtabayu16/study-cicd.git

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git add .
warning: LF will be replaced by CRLF in backend-cicd/.gitignore.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/.mvn/wrapper/maven-wrapper.properties.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/mvnw.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/mvnw.cmd.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/pom.xml.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/src/main/java/com/projectbackend/backendcicd/BackendCicdApplication.java.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/src/main/resources/application.properties.
The file will have its original line endings in your working directory
warning: LF will be replaced by CRLF in backend-cicd/src/test/java/com/projectbackend/backendcicd/BackendCicdApplicationTests.java.
The file will have its original line endings in your working directory

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git commit -m "buat project"
[master 676e131] buat project
 9 files changed, 634 insertions(+)
 create mode 100644 backend-cicd/.gitignore
 create mode 100644 backend-cicd/.mvn/wrapper/maven-wrapper.jar
 create mode 100644 backend-cicd/.mvn/wrapper/maven-wrapper.properties
 create mode 100644 backend-cicd/mvnw
 create mode 100644 backend-cicd/mvnw.cmd
 create mode 100644 backend-cicd/pom.xml
 create mode 100644 backend-cicd/src/main/java/com/projectbackend/backendcicd/BackendCicdApplication.java
 create mode 100644 backend-cicd/src/main/resources/application.properties
 create mode 100644 backend-cicd/src/test/java/com/projectbackend/backendcicd/BackendCicdApplicationTests.java

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git push origin master
Enumerating objects: 27, done.
Counting objects: 100% (27/27), done.
Delta compression using up to 4 threads
Compressing objects: 100% (17/17), done.
Writing objects: 100% (26/26), 59.04 KiB | 1.74 MiB/s, done.
Total 26 (delta 0), reused 0 (delta 0), pack-reused 0
To https://github.com/tirtabayu16/study-cicd.git
   7e351a7..676e131  master -> master

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$ git log
commit 676e13163308fc22c446ede8ca946a2dadf1abe1 (HEAD -> master, origin/master)
Author: tirtabayu16 <tirtaabayuu@gmail.com>
Date:   Thu Apr 14 14:12:09 2022 +0700

    buat project

commit 7e351a76c12e748dca1c481ada2a194e374142f7
Author: tirtabayu16 <94955594+tirtabayu16@users.noreply.github.com>
Date:   Thu Apr 14 13:57:40 2022 +0700

    Initial commit

acer@DESKTOP-IRM8VKE MINGW64 /f/BackEnd/project-cicd (master)
$                                                       