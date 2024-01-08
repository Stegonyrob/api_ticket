<script setup>
</script>
<template>
    <div>
        <div class="container">
            <h5>Estado de la solicitud:</h5>
            <ul>
                <li>
                    <input type="radio" id="f-option" name="selector" class="solved">
                    <label for="f-option">Resuelta satisfactoriamente</label>
                    <div class="check"></div>
                </li>
                <li>
                    <input type="radio" id="s-option" name="selector" class="discard">
                    <label for="s-option">No se pudo resolver</label>
                    <div class="check">
                        <div class="inside"></div>
                    </div>
                </li>
                <li>
                    <input class="revision" type="radio" id="t-option" name="selector">
                    <label for="t-option">En revisión</label>
                    <div class="check">
                        <div class="inside"></div>
                    </div>
                </li>
        </ul>
    </div>
</div></template>

<style scoped lang="scss">
.container ul {
    list-style: none;
    margin: 0;
   
}

ul li {
    color: black;
    display: block;
    position: relative;
    float: left;
    width: 12rem;
    height: 6rem;
}

ul li input[type=radio] {
    position: absolute;
    visibility: hidden;
}

ul li label {
  
    display: block;
    position: relative;
   
    font-size: 1rem;
    padding: 14px 12px 29px 56px;
    margin: 10px auto;
 
    z-index: 9;
    cursor: pointer;
}

ul li:hover label {
    color: #FFFFFF;
}

ul li .check {
    display: block;
    position: absolute;
    border: 5px solid #AAAAAA;
    border-radius: 100%;
    height: 25px;
    width: 25px;
    top: 30px;
    left: 20px;
    z-index: 5;
    transition: border .25s linear;
    -webkit-transition: border .25s linear;
}

ul li:hover .check {
    border: 5px solid #FFFFFF;
}

ul li .check::before {
    display: block;
    position: absolute;
    content: '';
    border-radius: 100%;
    height: 14px;
    width: 14px;
    top: 0.6px;
    left: 1px;
    margin: auto;
    transition: background 0.25s linear;
    -webkit-transition: background 0.25s linear;
}



.solved:checked~.check {
    border: 5px solid #0DFF92;
}

.solved:checked~.check::before {
    background: #0DFF92;
}

.solved:checked~label {
    color: #0DFF92;
}

.discard:checked~.check {
    border: 5px solid red;
}

.discard:checked~.check::before {
    background: red;
}

.discard:checked~label {
    color: red;
}

.revision:checked~.check {
    border: 5px solid yellow;
}

.revision:checked~.check::before {
    background: yellow;
}

.revision:checked~label {
    color: yellow;
}
</style>