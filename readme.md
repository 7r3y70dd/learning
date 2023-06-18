# Overview
Workspace for learning projects

## [git](https://phoenixnap.com/kb/how-to-use-git)

- [git flow](https://danielkummer.github.io/git-flow-cheatsheet/)

```shell
% git status
# workspace status
% git branch
# add commit push
%  git add .; git commit -m '[comment]'; git push
```

```shell
% git flow init
```

## [homebrew](https://brew.sh)

- [brew bundle](https://github.com/Homebrew/homebrew-bundle)
- bootstrap

```shell
% /bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"
% xcode-select --install
% brew doctor
% brew upgrade
% brew init
% brew dump
% brew install -f Brewfile
% brew doctor
```

## [markdown](https://www.markdownguide.org/cheat-sheet/)

## [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## [Spring](https://spring.io)
- [spring web]()
- [spring data]()

## [Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## [intelliJ]()

## [markdown](https://www.markdownguide.org/cheat-sheet/)

## [Java](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html)

## [Spring](https://spring.io)

## [Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## [intelliJ](https://www.jetbrains.com/idea/)

## [kubernetes](https://kubernetes.io)

## [aws](https://aws.amazon.com)

- [rds/postgresql](https://aws.amazon.com/rds/postgresql) : Relational Data Service
- [redis](https://aws.amazon.com/redis/) : Remote Dictionary Service
- [s3](https://aws.amazon.com/s3/) : Simple Storage Service
- [kafka](https://aws.amazon.com/msk/)
- [localstack](https://localstack.cloud) : fully functional local aws

## (postgresql)[]

- [tutorial](https://www.postgresqltutorial.com)
- [pgcli](https://www.pgcli.com)
- [dbeaver](https://dbeaver.io)

## shell

- [zsh](https://ohmyz.sh)
- [nc](https://linuxize.com/post/netcat-nc-command-with-examples/)

```shell
% nc -z localhost [port]
```

## [kubernetes](https://artifacthub.io/packages/helm/bitnami/postgresql)

- [microk8s](https://microk8s.io)
  - [multipass](https://multipass.run)
- [k9s](https://k9scli.io)
- [helm](https://helm.sh)
  - [helm hub](https://artifacthub.io)
    - [bitnami postgresql](https://artifacthub.io/packages/helm/bitnami/postgresql)

```shell
% brew install ubuntu/microk8s/microk8s
% brew reinstall python
% microk8s install --cpu 6 --mem 10 --disk 100
% microk8s status --wait-ready
% multipass set local.driver=qemu
% microk8s start
% microk8s enable dns hostpath-storage
% mkdir -p ~/.kube
% microk8s config > ~/.kube/config
% chmod 600 ~/.kube/config
% aliase kubectl="microk8s kubectl"
% kubectl version
% kubectl get all -A
% kubectl api-versions
% k9s
% brew install helm
% helm list
% helm install postgresql --set auth.postgresPassword=pgpwd oci://registry-1.docker.io/bitnamicharts/postgresql
...
# cleanup
% helm delete postgresql
% microk8s stop
% multipass list
% multipass delete microk8s-vm 
% multipass purge 
% brew uninstall --zap multipass
% brew uninstall --zap microk8s
% kubectl delete pvc -l release=my-release
```

```shell
% kubectl port-forward --namespace default svc/postgresql 5432:5432 &
% nc -z localhost 5342
Connection to localhost port 5432 [tcp/postgresql] succeeded!
% kubectl get secret --namespace default postgresql -o jsonpath="{.data.postgres-password}" | base64 -d
```

```pgcli
% pgcli -h localhost -p 5432 -U postgres
Password for postgres:
Server: PostgreSQL 15.3
Version: 3.5.0
Home: http://pgcli.com
postgres@localhost:postgres>
...
postgres@localhost:postgres> select now()
...
postgres@localhost:postgres> quit
```