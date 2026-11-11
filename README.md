## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## ================================================================================================

Outils essentiel pour le suite du projet
1-Installer Github sur windows avec la commande widget
    winget install --id Git.Git -e --source winget

2- verifier la version de github
        git --version  (version installee:=> git version 2.56.0.windows.4)

3- pour generer l'organisation du projet on utilise la commande 
   tree /f /a | Out-File -Encoding utf8 arborescence.txt

## =====================================================================
# 1. Initialiser Git dans le dossier dans la racine du projet
    git init

# 2. Ajout de tous les dossiers et fichiers .java ( les fichiers .class ne sont pas pris en compte: voir .gitingore )
    git add .

# 3. Vérification en 'vert' de la liste des fichiers sélectionnés
    git status

# 4. Je valide la premiere version avec un message
    git commit -m "Ajout du projet Java organise"

# 5. La branche principale est nomme "main"
    git branch -M main

# 6. Je connecte le dossier local au dépôt de mon organisation GitHub
# Depot de mon organisation
    git remote add origin https://github.com/M1SIGL/DEVOIR_N-1-PATRONS_DE_CONSTRUCTION_-INF467-.githttps://github.com

# 7. Envoie du projet sur GitHub
    git push -u origin main

