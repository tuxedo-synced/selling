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

    <link
        rel="stylesheet"
        href="${pageContext.request.contextPath}/css/register.css"
    />

    <title>Register</title>
</head>

<body>

    <div class="register-heading">
        <p>Register</p>
    </div>

    <div class="divider-section">
        <hr />
    </div>

    <div style="height: 10vh"></div>

    <div class="register-container">

        <form class="register-form"
            action="${pageContext.request.contextPath}/register"
            method="post">

            <input
                type="text"
                name="username"
                placeholder="Username"
                required
            />

            <input
                type="email"
                name="email"
                placeholder="Email"
                required
            />

            <input
                type="password"
                name="password"
                placeholder="Password"
                required
            />

            <input
                type="password"
                name="confirmPassword"
                placeholder="Confirm password"
                required
            />

            <button type="submit">Register</button>

        </form>


        <div class="oauth-divider">
            <span>OR</span>
        </div>


        <div class="oauth-section">

            <a
                class="oauth-button google"
                href="${pageContext.request.contextPath}/oauth2/authorization/google"
            >
                <span class="oauth-icon">G</span>
                <span>Continue with Google</span>
            </a>

            <a
                class="oauth-button github"
                href="${pageContext.request.contextPath}/oauth2/authorization/github"
            >
                <span class="oauth-icon">GH</span>
                <span>Continue with GitHub</span>
            </a>

        </div>


        <div class="login-text">
            Already have an account?
            <a href="${pageContext.request.contextPath}/login">
                Login
            </a>
        </div>

    </div>

</body>

</html>