<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
<?php

    $text = $_GET['texto'];
    $color = $_GET['color'];
    $tamanho = $_GET['tamanho'];
    

?>
<font color="<?php print $color ?>" size="<?php echo $tamanho ?>" >   <?php print $text ?>   </font>
</body>
</html>