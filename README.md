# IDMProjectAkoYadoh
Projet consistant à créer deux compilateurs et un interpréteur pouvant faire du Machine Learning Regression

Ce projet comporte un compilateur Python.
Ce projet comporte un compilateur R.
Ce projet comporte un interpréteur.

Bibliothèques utilisées pour le compilateur Python : 
from sklearn import svm
from sklearn.tree import DecisionTreeRegressor
import numpy

Bibliothèques utiliséées pour le compilateur R :
install.packages(e1071)
install.packages(tree)
library(e1071)
library(tree)
library(rpart)

Télécharger Rscript.exe et le mettre "C:\\Program Files\\R\\R-4.0.3\\

Bibliothèques utilisées pour l'interpréteur :
weka
libSVM

Exemple de code : 
Fichier "data.txt"
Delimiteur ","
Algorithme Linear
Predire 75

Fichier : Permet de définir le chemin d’accès au fichier.
Delimiteur : Permet de donner le délimiteur des colonnes du fichier
Algorithme : Permet à l’utilisateur de faire son choix d’algorithme 
Predire : Qui prend en entrée un entier permettant de séparer l’ensemble des données en données d’entraînement et de test.

Pour effectuer les tests de compilateurs et interpréteur, allez dans les dossier
org.xtext.example.mydsl.tests/src/MyDslParsingTest.xtend et lancer le script de test.
