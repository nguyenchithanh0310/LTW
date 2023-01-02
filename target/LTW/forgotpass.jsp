<%--
  Created by IntelliJ IDEA.
  User: acer
  Date: 02/01/2023
  Time: 13:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link rel="stylesheet" href="css/plugins.css" />
    <link rel="stylesheet" href="css/main.css" />
    <link rel="shortcut icon" type="image/x-icon" href="image/favicon.ico">
    <title>Petmark ❤️</title>
</head>
<body class="petmark-theme-2">
<div class="site-wrapper">
   <jsp:include page="header/header.jsp"></jsp:include>
    <nav aria-label="breadcrumb" class="breadcrumb-wrapper">
        <div class="container">
            <ol class="breadcrumb">
                <li class="breadcrumb-item"><a href="index.html">Trang chủ</a></li>
                <li class="breadcrumb-item active" aria-current="page">Quên mật khẩu</li>
            </ol>
        </div>
    </nav>

    <main class="page-section pb--10 pt--50">
        <div class="container">
            <header class="entry-header">
                <h1 class="entry-title">Quên mặt khẩu</h1>
            </header>
            <form class="form password forget" action="" method="post" id="form-validate" novalidate="novalidate">
                <fieldset class="field-set" data-hasrequired="* Required Fields">
                    <div class="field note">Vui lòng nhập địa chỉ email của bạn dưới đây để nhận liên kết đặt lại mật khẩu.</div>
                    <div class="field email required">
                        <label for="email_address" class="label"><span>Email*</span></label>
                        <div class="control">
                            <input type="email" name="email" alt="email" id="email_address" class="input-text" value="" data-validate="{required:true, 'validate-email':true}" aria-required="true">
                        </div>
                    </div>
                </fieldset>
                <div class="actions-toolbar">
                    <div class="primary">
                        <button type="submit" class="action submit primary"><span>Đặt lại mật khẩu</span></button>
                    </div>
                    <div class="secondary">
                        <a class="action back" href="home"><span>Quay lại</span></a>
                    </div>
                </div>
            </form>
        </div>
    </main>
    <jsp:include page="footer/footer.jsp"></jsp:include>
<script src="js/plugins.js"></script>
<script src="js/ajax-mail.js"></script>
<script src="js/custom.js"></script>
</body>
</html>
