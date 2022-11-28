<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>게시판</title>
    <link rel="stylesheet" href="../css/style.css">
    <script src="/js/jquery-3.6.1.min.js"></script>
</head>
<body>
    <section class = "login-form">
      <img src="../image/board.png" style="width: 250px; margin-bottom: 10px; margin-left: 85px;">
      <form action = "">
        <div class = "int-area">
          <input type="text" name="id" id="id"
                 autocomplete="off" required>
                 <label for="id">USER ID</label>
        </div>
        <div class="int-area">
            <input type="password" name="pw" id="pw"
            autocomplete="off" required>
            <label for="pw">PASSWORD</label>
        </div>
          <div class="btn-area", style="display: flex">

              <button type="submit">로그인</button>
              <button type="submit">회원가입</button>
          </div>
      </form>
      </div>
    </section>

</body>
</html>