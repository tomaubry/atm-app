# Simulation d'un Distributeur Automatique de Billets (ATM)

Ce projet est une simulation d’un distributeur automatique de billets (ATM). Il utilise Java et Maven pour gérer les dépendances et la compilation.

## 📌 1. Fonctionnalités principales

- **Gestion des cartes bancaires** : Chaque carte a un numéro, un code PIN et un solde.
- **Simulation d’un distributeur ATM** : Permet d’insérer une carte, d’entrer un code PIN et de retirer de l’argent.
- **Gestion des retraits** : Vérifie le solde et distribue les billets en conséquence.

## 📂 2. Analyse des classes

### 🔹 `Card.java` (Représente une carte bancaire)
**Attributs :**
- `number` : numéro de carte.
- `pin` : code PIN à 4 chiffres.
- `balance` : solde disponible.

**Méthodes :**
- **Constructeur** : Crée une carte avec un numéro, un PIN et un solde.
- **Getters et Setters** : Accéder et modifier les informations de la carte.

### 🔹 `Bank.java` (Gère les cartes bancaires)
**Attributs :**
- `Map<Integer, Card> cards` : Stocke les cartes associées à un numéro.

**Méthodes :**
- `getCard(int number)` : Récupère une carte à partir de son numéro.
- `canWithdraw(Card card, double amount)` : Vérifie si un retrait est possible en fonction du solde.
- `updateCardBalance(Card card, double newBalance)` : Met à jour le solde de la carte.

### 🔹 `ATM.java` (Simule un distributeur automatique)
**Attributs :**
- `Bank bank` : Contient les cartes disponibles.
- `Scanner scanner` : Permet de saisir les entrées utilisateur.

**Méthodes :**
- `start()` : Démarre l’ATM, demande le numéro de carte, le PIN et le montant à retirer.
- `dispenseBanknotes(double amount)` : Simule la distribution des billets en affichant les coupures disponibles.

### 🔹 `Main.java` (Point d’entrée du programme)
- Crée une instance de `ATM` et lance la méthode `start()`.

## 🛠 3. Fonctionnement du programme

1. L'utilisateur insère un numéro de carte.
2. Il entre son code PIN.
3. Il saisit le montant à retirer.
4. Le programme vérifie le solde et effectue le retrait si possible.
5. L'ATM simule la distribution des billets.
6. L'utilisateur peut répéter l’opération ou quitter.

## ⚙️ 4. Prérequis

Avant de pouvoir exécuter le programme, vous devez disposer de :
- **Java** (version 8 ou supérieure)
- **Maven** pour gérer les dépendances et la compilation.

## 🚀 5. Installation et exécution

1. Clonez ce dépôt :
   ```bash
   git clone https://github.com/nom-utilisateur/atm-simulation.git
