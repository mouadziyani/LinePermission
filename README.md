# LinePermission

LinePermission est une application console Java qui reproduit de manière simplifiée le système de permissions de fichiers sous Linux.

## Fonctionnalités

### Partie 1 — Utilisateurs
- Créer un compte
- Se connecter
- Se déconnecter
- Sauvegarder les utilisateurs
- Sécuriser les mots de passe avec BCrypt

### Partie 2 — Fichiers
- Créer des fichiers
- Lister les fichiers
- Lire et modifier leur contenu
- Gérer les permissions

## Permissions

Chaque fichier possède trois permissions :

- `r` : lecture
- `w` : écriture
- `d` : suppression

Les permissions sont séparées entre le propriétaire et les autres utilisateurs.

Exemple :

`rwd|r--`

## Technologies

- Java
- jBCrypt
- Stockage dans des fichiers texte

## Structure

- `model` : modèles de données
- `service` : logique de l'application
- `ui` : interface console
- `resources` : sauvegarde des utilisateurs et fichiers
- `lib` : dépendances externes