<%@ page isELIgnored="false" %>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Error</title>
        <style>
            #particles-js {
                position: absolute;
                width: 100%;
                height: 100%;
            }

            body {
                background: #97cfca;
                overflow: hidden;
            }

            .terminal-window {
                text-align: left;
                width: 37.5rem;
                height: 22.5rem;
                border-radius: 0.625rem;
                margin: auto;
                position: relative;
                top: 10.5rem;
            }

            .terminal-window header {
                background: #e0e8f0;
                height: 1.875rem;
                border-radius: 0.5rem 0.5rem 0 0;
                padding-left: 0.625rem;
            }

            .terminal-window header .button {
                width: 0.75rem;
                height: 0.75rem;
                margin: 0.625rem 0.25rem 0 0;
                display: inline-block;
                border-radius: 0.5rem;
            }

            .terminal-window header .button.green {
                background: #3bb662;
            }

            .terminal-window header .button.yellow {
                background: #e5c30f;
            }

            .terminal-window header .button.red {
                background: #e75448;
            }

            .terminal-window section.terminal {
                color: white;
                font-family: Menlo, Monaco, "Consolas", "Courier New", "Courier";
                font-size: 11pt;
                background: #30353a;
                padding: 0.625rem;
                box-sizing: border-box;
                position: absolute;
                width: 100%;
                top: 1.875rem;
                bottom: 0;
                overflow: auto;
            }

            .terminal-window section.terminal .typed-cursor {
                opacity: 1;
                -webkit-animation: blink 0.7s infinite;
                -moz-animation: blink 0.7s infinite;
                animation: blink 0.7s infinite;
            }

            @keyframes blink {
                0% {
                    opacity: 1;
                }

                50% {
                    opacity: 0;
                }

                100% {
                    opacity: 1;
                }
            }

            @-webkit-keyframes blink {
                0% {
                    opacity: 1;
                }

                50% {
                    opacity: 0;
                }

                100% {
                    opacity: 1;
                }
            }

            @-moz-keyframes blink {
                0% {
                    opacity: 1;
                }

                50% {
                    opacity: 0;
                }

                100% {
                    opacity: 1;
                }
            }

            .terminal-data {
                display: none;
            }

            .terminal-window .gray {
                color: gray;
            }

            .terminal-window .green {
                color: green;
            }

            /*Media for mobile responsive viewing*/
            @media only screen and (max-width: 600px) {
                .terminal-window {
                    text-align: left;
                    width: 37.5vmin;
                    height: 22.5vmin;
                    border-radius: 0.625vmin;
                    margin: auto;
                    position: relative;
                    top: 30.5vmin;
                }
            }

            @media only screen and (max-width: 600px) {
                .terminal-window header {
                    background: #e0e8f0;
                    height: 1.875vmin;
                    border-radius: 0.5vmin 0.5vmin 0 0;
                    padding-left: 1vmin;
                }
            }

            @media only screen and (max-width: 600px) {
                .terminal-window header .button {
                    width: 0.75vmin;
                    height: 0.75vmin;
                    margin: 0.625vmin 0.25vmin 0 0;
                    display: inline-block;
                    border-radius: 0.5vmin;
                }
            }

            @media only screen and (max-width: 600px) {
                .terminal-window header .button.green {
                    background: #3bb662;
                }
            }

            @media only screen and (max-width: 600px) {
                .terminal-window header .button.yellow {
                    background: #e5c30f;
                }
            }

            @media only screen and (max-width: 600px) {
                .terminal-window header .button.red {
                    background: #e75448;
                }
            }

            @media only screen and (max-width: 600px) {
                .terminal-window section.terminal {
                    color: white;
                    font-family: Menlo, Monaco, "Consolas", "Courier New", "Courier";
                    font-size: 0.6875vmin;
                    background: #30353a;
                    padding: 0.625vmin;
                    box-sizing: border-box;
                    position: absolute;
                    width: 100%;
                    top: 1.875vmin;
                    bottom: 0;
                    overflow: auto;
                }
            }

            .terminal-window section.terminal .typed-cursor {
                opacity: 1;
                -webkit-animation: blink 0.7s infinite;
                -moz-animation: blink 0.7s infinite;
                animation: blink 0.7s infinite;
            }

            @keyframes blink {
                0% {
                    opacity: 1;
                }

                50% {
                    opacity: 0;
                }

                100% {
                    opacity: 1;
                }
            }

            @-webkit-keyframes blink {
                0% {
                    opacity: 1;
                }

                50% {
                    opacity: 0;
                }

                100% {
                    opacity: 1;
                }
            }

            @-moz-keyframes blink {
                0% {
                    opacity: 1;
                }

                50% {
                    opacity: 0;
                }

                100% {
                    opacity: 1;
                }
            }

            .terminal-data {
                display: none;
            }

            .terminal-window .gray {
                color: gray;
            }

            .terminal-window .green {
                color: green;
            }
        </style>
    </head>

    <body>
        <div id="particles-js"></div>
        <div class="terminal-window">
            <header>
                <div class="button green"></div>
                <div class="button yellow"></div>
                <div class="button red"></div>
            </header>
            <section class="terminal">
                <div class="history"></div>
                $&nbsp;<span class="prompt">${msg} </span>
                <span class="typed-cursor"></span>

            </section>
        </div>
    </body>

    </html>