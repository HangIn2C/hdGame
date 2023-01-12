let game_board = document.getElementById('game-board');

for (let i = 0; i < 64; i++) {
    game_board.innerHTML += "<div class=game></div>";
}

let game = document.getElementsByClassName('game');

let toggle = 0;
for (let i = 0; i < 64; i++) {
    if (i % 8 == 0) toggle++;

    if (toggle % 2 == 0) {
        if (i % 2 == 0) {
            game[i].classList.add("white");
        } else {
            game[i].classList.add("black");
        }
    } else {
        if (i % 2 == 0) {
            game[i].classList.add("black");
        } else {
            game[i].classList.add("white");
        }
    }
}