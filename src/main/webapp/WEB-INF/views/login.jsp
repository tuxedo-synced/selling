<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<!doctype html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />

    <link
        href="https://fonts.googleapis.com/css2?family=Montserrat:wght@400;500;600;700;800;900&family=Syne:wght@400;500;600;700;800&display=swap"
        rel="stylesheet"
    />

    <link rel="stylesheet"
        href="${pageContext.request.contextPath}/css/login.css" />

    <title>Login</title>
</head>

<body>

    <div class="login-heading">
        <p class="heading">Login</p>
    </div>

    <div class="login-container">

        <form class="login-form"
            method="post">

            <input type="text"
                name="username"
                placeholder="Username or email"
                required />

            <input type="password"
                name="password"
                placeholder="Password"
                required />

            <button type="submit">Login</button>

        </form>

        <div class="oauth-divider">
            <span>OR</span>
        </div>

        <div class="oauth-section">

            <a class="oauth-button google"
                href="${pageContext.request.contextPath}/oauth2/authorization/google">
                <span class="oauth-icon">G</span>
                <span>Continue with Google</span>
            </a>

            <a class="oauth-button github"
                href="${pageContext.request.contextPath}/oauth2/authorization/github">
                <span class="oauth-icon">GH</span>
                <span>Continue with GitHub</span>
            </a>

        </div>

        <div class="register-text">
            <span>Don't have an account?</span>
            <a href="${pageContext.request.contextPath}/register">
                Register
            </a>
        </div>

    </div>

</body>
</html>