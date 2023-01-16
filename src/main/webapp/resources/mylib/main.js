let main = document.getElementsByTagName('body');

let header = document.getElementById('header');
let slide_container = document.getElementById('slide-container');

let slide_img = slide_container.querySelector('#slide-img');
let slide_title = slide_container.querySelector('.slide-title');
let slide_detail = slide_container.querySelector('.slide-detail');
let slide_button = slide_container.querySelectorAll('.button a');

let slide_nav = document.getElementById('slide-nav');
let headerGame = slide_nav.getElementsByClassName('cursor');

console.log(slide_button[0]);

for (let e of headerGame) {
    e.addEventListener('click', () => {
        if (e.innerText == "CHESS") {
            slide_img.setAttribute("src", "resources/images/chess.jpg");
            slide_title.innerHTML = "CHESS";
            slide_detail.innerHTML = "<p>64개의 칸에서 이루어지는 치열한 두뇌전</p><p>상대의 수를 읽어 왕을 잡아 최후의 승자가 되어라</p>";
            slide_button[0].setAttribute("href", "game/chess")
            slide_button[1].setAttribute("href", "chat/chess")
        }

        if (e.innerText == "CARD") {
            slide_img.setAttribute("src", "resources/images/card.jpg");
            slide_title.innerHTML = "CARD";
            slide_detail.innerHTML = "<p>테이블 위에서의 신경전</p><p>상대의 심리를 읽어 승자가 되어라</p>";
            slide_button[0].setAttribute("href", "game/card")
            slide_button[1].setAttribute("href", "chat/card")
        }
        if (e.innerText == "BADUK") {
            slide_img.setAttribute("src", "resources/images/baduk.jpg");
            slide_title.innerHTML = "BADUK";
            slide_detail.innerHTML = "<p>동양 게임의 진수</p><p>바둑판 위에서의 최고의 한수를 두어라</p>";
            slide_button[0].setAttribute("href", "game/baduk")
            slide_button[1].setAttribute("href", "chat/baduk")
        }
        if (e.innerText == "TICTACTOE") {
            slide_img.setAttribute("src", "resources/images/tic_tac_toe.jpg");
            slide_title.innerHTML = "TICTACTOE";
            slide_detail.innerHTML = "<p>단순하지만 치열하게</p><p>9개의 칸에서 벌어지는 치열한 심리전</p>";
            slide_button[0].setAttribute("href", "game/tictactoe")
            slide_button[1].setAttribute("href", "chat/tictactoe")
        }
    })
}

window.onload = () => {

}