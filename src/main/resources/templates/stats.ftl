<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Player Stats</title>
    </head>
    <body style="text-align: center; font-family: sans-serif">
    <img src="/ninja.png" alt="ninja" width="50px" height="50px">
    <h1>Player Stats</h1>
    <p><i>Powered by Spring Boot & Freemarker!</i></p>
    <hr>
    <span>等级 </span><span>${stats.level}</span><br>
    <span>经验 </span><span>${stats.experience}</span><br>
    <span>体力 </span><span>${stats.healthPoint}</span><br>
    <span>敏锐 </span><span>${stats.acuity}</span><br>
    <span>理智 </span><span>${stats.sanity}</span><br>
    <span>压力 </span><span>${stats.pressure}</span><br>
    <span>体格 </span><span>${stats.physique}</span><br>
    <span>心态 </span><span>${stats.mentality}</span><br>
    </body>
    </html>