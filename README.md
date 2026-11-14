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
---

## 👤 Auteur

**Mouad Ziyani** — Développeur Full-Stack (PHP/Laravel · Java/Spring · React)

[![Portfolio](https://img.shields.io/badge/Portfolio-mouadziyani.com-d92632?style=flat-square)](https://mouadziyani.com)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Mouad%20Ziyani-0A66C2?style=flat-square&logo=linkedin)](https://www.linkedin.com/in/mouad-ziyani-956484339)
[![GitHub](https://img.shields.io/badge/GitHub-mouadziyani-181717?style=flat-square&logo=github)](https://github.com/mouadziyani)

## 📄 Licence

© 2025-2026 Mouad Ziyani — **Tous droits réservés.**

Ce projet est publié uniquement à titre de démonstration (portfolio). Il est **interdit** de copier, cloner, modifier, redistribuer ou réutiliser ce code, en tout ou en partie, sans l'autorisation écrite préalable de l'auteur. Voir le fichier [LICENSE](LICENSE).
