# Overview
Workspace for learning projects

## [git](https://phoenixnap.com/kb/how-to-use-git)

```shell
% git status
# workspace status
% git branch
```

## [homebrew](https://brew.sh)
### bootstrap
```shell
% /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
% xcode-select --install
% brew init
% brew upgrade
% brew dump
% brew install -f Brewfile
```
## [markdown](https://www.markdownguide.org/cheat-sheet/)
## [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)
## [Spring](https://spring.io)
## [Gradle](https://docs.gradle.org/current/userguide/userguide.html)
## [intelliJ]()

# Overview
Workspace for learning projects

## [git](https://phoenixnap.com/kb/how-to-use-git)

```shell
% git status
# workspace status
% git branch
# add commit push
%  git add .; git commit -m '[comment]'; git push
```

### [git flow](https://danielkummer.github.io/git-flow-cheatsheet/)

```shell
% git flow init
```

## [homebrew](https://brew.sh)

### bootstrap
```shell
% /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
% xcode-select --install
\% brew doctor
% brew upgrade
% brew init
% brew dump
% brew install -f Brewfile
% brew doctor
```

## [markdown](https://www.markdownguide.org/cheat-sheet/)

## [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## [Spring](https://spring.io)

## [Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## [intelliJ](https://www.jetbrains.com/idea/)

## [zsh](https://ohmyz.sh)

## [kubernetes](https://kubernetes.io)

## [aws](https://aws.amazon.com)

### [rds/postgresql](https://aws.amazon.com/rds/postgresql) : Relational Data Service

### [redis](https://aws.amazon.com/redis/) : Remote Dictionary Service

### [s3](https://aws.amazon.com/s3/) : Simple Storage Service

### [kafka](https://aws.amazon.com/msk/)

### [localstack](https://localstack.cloud) : fully functional local aws

## (postgresql)[]

- [tutorial]()

## shell

- [zsh]()
- [nc]()

```shell
% nc -z localhost [port]
```
## [kubernetes]()

- [microk8s]()
- [k9s]()
- [helm]()

```shell
% brew install ubuntu/microk8s/microk8s
% microk8s install --cpu 8 --mem 10 --disk 100
% microk8s status
% microk8s enable dns storage
% mkdir -p ~/.kube
% microk8s config > ~/.kube/config
% chmod 600 ~/.kube/config
% kubectl version
% kubectl get all -A
% kubectl api-versions
% k9s
% brew install helm
% helm install postgresql oci://registry-1.docker.io/bitnamicharts/postgresql
```