<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <!--favicon-->
    <link rel="shortcut icon" href="https://p7.hiclipart.com/preview/988/211/651/white-coffee-tea-cafe-computer-icons-cup-of-coffee-icon.jpg">
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>COFFEESAZO</title>
    <link rel=“stylesheet” href=“./css/bootstrap.min.css” type=“text/css”> 
    <link rel="stylesheet" href="./css/index copy.css" type="text/css">
    <script src="https://code.jquery.com/jquery-3.5.1.js"
        integrity="sha256-QWo7LDvxbWT2tbbQ97B53yJnYU3WhH/C8ycbRAkjPDc=" crossorigin="anonymous"></script>
    <link href="./css/findPassword-finish.css" rel="stylesheet" type="text/css" />
</head>

<body>
    <header class="header">
        <div class="header-align">
            <div class="header-logo">
                <a href="#"><img src="./img/logo_white.png" class="logo"></a>
            </div>
            <div class="btns-signin-signup">
                <span><a href="#">로그인</a></span>
                <span><a href="#">회원가입</a></span>
                <span><a href="#">고객센터</a></span>
                <span><a href="#"><img src="./img/shoppingcart_white.png" id="shoppingcart"></a></span>
            </div>
        </div>

        <div class="shopping">
            <span id="wholebean"><a href="#">원두</a></span>
            <!-- onmouseover 써볼지? (javascript)-->
            <span id="stickcoffee"><a href="#">스틱커피</a></span>
            <span id="capsulecoffee"><a href="#">캡슐커피</a></span>

        </div>
    </header>

    <!--findPassword-finish start!-->
    <div class="main-body"> <!--전체 div시작-->
        <form> 
            <div class="wrapper">
                <p class="main-title">비밀번호 재설정</p>
                <p>　</p>
                <p class="sub-title">비밀번호가 정상적으로<br>변경 되었습니다.</p>
                <p>　</p>
                <p>
                    <input class="findid-button" type="button" value="로그인 하러 가기"
                    onclick="location.href='login2.html'">  <!--인덱스페이지로이동(헤더에 로그아웃버튼있는..) -->
                </p>
            </div>
        </form> 
    </div> <!--전체 div 끝-->
     <!--findPassword-finish end!-->

    <footer>
        <div class="footer">
            <ul class="footer-list-box">
                <li>COFFEESAZO | 대표자: 이지현 | 사업자등록번호 123-45-67890</li>
                <li>서울특별시 영등포구 선유도2로 57 이레빌딩(구관) 19F</li>
                <li>책임자: 제윤지 | 개인정보관리책임자: 김은규</li>
                <li>고객센터 02-1234-5678 | E-mail: customer@coffeesazo.com</li>
            </ul>
        </div>
    </footer>
</body>

</html>