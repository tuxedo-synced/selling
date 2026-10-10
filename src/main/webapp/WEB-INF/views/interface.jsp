<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>AcadeX - Dashboard</title>

    <link rel="stylesheet"
          href="${pageContext.request.contextPath}/css/interface.css">
</head>

<body>

    <header class="header">

        <div class="logo">
            <h1>AcadeX</h1>
        </div>

        <div class="actions">
            <a href="${pageContext.request.contextPath}/">Home</a>
            <a href="${pageContext.request.contextPath}/error">Logout</a>
        </div>

    </header>


    <main class="container">

        <section class="welcome">

            <h1>Welcome to AcadeX 👋</h1>

            <p>
                Learn. Share. Earn.
            </p>

        </section>


        <section class="cards">

            <div class="card">
                <h2>BUY</h2>
                <p>
                    Browse and purchase study notes from other students.
                </p>

                <button>Browse Notes</button>
            </div>


            <div class="card">
                <h2>SELL</h2>
                <p>
                    Upload your notes and earn money when someone purchases them.
                </p>

                <button>Sell Notes</button>
            </div>


            <div class="card">
                <h2>PROFILE</h2>
                <p>
                    Manage your account and personal information.
                </p>

                <button>My Profile</button>
            </div>

        </section>

    </main>

</body>

</html>