<?php


$pdo = new PDO('mysql:host=localhost;dbname=blogpoo;charset=utf8', 'root', '',[
    PDO::ATTR_ERRMODE => PDO::ERMODE_EXCEPTION,
    PDO::ATTR_DEFAULT_FETCH_MODE => PDO::FETCH_ASSOC
]);


$resultats = $pdo->query('SELECT * FROM articles order by created_at desc');
$articles = $resultats->fetchAll();

$pageTitle = "Accueil";
ob_start();
require ('templates/articles/indexx.html.php');
$pageContent = ob_get_clean();

require ('templates/layout.html.php');

echo $pageContent;
echo $pageTitle;