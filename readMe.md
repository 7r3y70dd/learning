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
- [spring data](https://spring.io/projects/spring-data)

## [PostgreSQL](https://www.postgresql.org)
- [tutorial](https://www.postgresqltutorial.com)

## [Gradle](https://docs.gradle.org/current/userguide/userguide.html)

## [intelliJ](https://www.jetbrains.com/idea/)

## [kubernetes](https://kubernetes.io)
- [overview](https://kubernetes.io/docs/concepts/overview/)
- [componenets](https://kubernetes.io/docs/concepts/overview/components/)
- [componenets video](https://www.youtube.com/watch?v=Krpb44XR0bk)
- [k8s in 15 minutes](https://www.youtube.com/watch?v=VnvRFRk_51k)
- [k9s](https://k9scli.io)

## [Microk8s](https://microk8s.io/)
- [Mac Turorial](https://ubuntu.com/tutorials/install-microk8s-on-mac-os?&_ga=2.196067940.930864994.1684962824-1971785032.1684962824#1-overview)

```shell
% brew install ubuntu/microk8s/microk8s
% multipass set local.driver=qemu
% microk8s install -y --cpu 6 --mem 10 --disk 100
% microk8s enable dns storage
% microk8s community
% microk8s registry storage
% echo "alias kubectl=\"microk8s kubectl\"" >> ~/.zshrc
% kubectl version
% kubectl api-version
% kubectl get all -A
% microk8s config > ~/.kube/config
# start vm
% microk8s start
# stop vm
% microk8s stop
# get password
% kubectl get secret --namespace default my-release-postgresql -o jsonpath="{.data.postgres-password}" | base64 -d
...
% brew uninstall --zap multipass
% brew uninstall --zap microk8s
```

## [Helm](https://helm.sh)
- [postgress](https://github.com/bitnami/charts/tree/main/bitnami/postgresql/#installing-the-chart)

```shell
% helm install my-release oci://registry-1.docker.io/bitnamicharts/postgresql
```

## Shell utilities

- [zsh](https://ohmyz.sh)
- [nc](https://www.geeksforgeeks.org/introduction-to-netcat/)
```shell
% nc -z localhost [port]
```
