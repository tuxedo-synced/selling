<%@ page contentType="text/html;charset=UTF-8" language="java" %>

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
        href="${pageContext.request.contextPath}/css/home.css"
        />

        <title>AcadeX</title>
    </head>

    <body>

        <!-- Header -->
        <div class="header-section">

            <div class="web-main-name">
                <h1>AcadeX</h1>
            </div>

            <div class="acess-section">
                <a
                class="login-bar"
                href="${pageContext.request.contextPath}/login"
                >
                Login
            </a>

            <a
            class="register-bar"
            href="${pageContext.request.contextPath}/register"
            >
            Register
        </a>
    </div>

</div>

<div class="divider-section">
    <hr />
</div>


<!-- Hero Section -->

<p class="caption-section">
    Learn. Share. Earn.
</p>

<p class="sub-caption-section">
    Simple and directly captures the platform.
</p>

<div class="divider-section">
    <hr />
</div>


<div style="height: 10vh"></div>


<!-- How It Works -->

<div class="how-it-works-section">

    <h1 class="heading-section">
        How it Works?
    </h1>

    <table class="table-section">

        <thead class="table-head-section">
            <tr>
                <th>Create an account</th>
                <th>Click on SELL & add details</th>
                <th>Get paid on sale</th>
            </tr>
        </thead>

        <tbody class="table-data-section">
            <tr>

                <td>
                    Sign up with your details and create your AcadeX account.
                </td>

                <td>
                    Upload your notes, add the subject, description and price.
                </td>

                <td>
                    Once your notes are purchased, receive your earnings securely.
                </td>

            </tr>
        </tbody>

    </table>

</div>


<div class="divider-section">
    <hr />
</div>


<div style="height: 10vh"></div>


<!-- Contact Section -->

<div class="contact-form">

    <h1 class="contact-heading">
        Contact me
    </h1>

    <div>

        <div class="contact-moto">
            <p>
                Need help with your purchase, selling notes, or have a suggestion?
                Send us a message and we'll get back to you.
            </p>
        </div>

        <div class="contact-ways">

            <a href="mailto:yourmail@example.com">
                Email
            </a>

            <a href="#">
                Instagram
            </a>

            <a href="#">
                X
            </a>

        </div>

    </div>

</div>


<div class="divider-section">
    <hr />
</div>


<div style="height: 10vh"></div>

</body>
</html>