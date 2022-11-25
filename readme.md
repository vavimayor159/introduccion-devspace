# Desarrollo de Apps en Kubernetes con devspace

## Introducción

Devspace es una herramienta creada para facilitar el desarrollo de aplicaciones en kubernetes, de manera que con un simple comando puedas actulizar el código que estas ejecutando en tus contenedores en la nube, sin tener que ejecutar pasos manuales

## Instalación

### Instalar minikube para poder ejecutar kubernetes de manera local

Guia oficial - https://minikube.sigs.k8s.io/docs/start/

En linux:
```
curl -LO https://storage.googleapis.com/minikube/releases/latest/minikube-linux-amd64
sudo install minikube-linux-amd64 /usr/local/bin/minikube
```

En Mac OS:
```
brew install minikube
```

En windows:

Ejecutar el instalador de la última versión: https://storage.googleapis.com/minikube/releases/latest/minikube-installer.exe

### Instalar kubectl para poder interactuar con el cluster

En Linux - https://kubernetes.io/docs/tasks/tools/install-kubectl-linux/

En MacOS - https://kubernetes.io/docs/tasks/tools/install-kubectl-macos/

En Windows - https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/

### Iniciar el cluster de minikube

```
minikube start
```

### Instalar devspace

En Linux - https://www.devspace.sh/docs/getting-started/installation?x0=5

En MacOS - https://www.devspace.sh/docs/getting-started/installation?x0=4

En Windows - https://www.devspace.sh/docs/getting-started/installation?x0=6


