<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>GLPK Frontend 1.0</h1>
      <hr noshade size="1" />
      <div class="infoPics">
        <img src="@/assets/gnu1.jpg" />
      </div>
      <hr noshade size="1" />
      <h2>Beschreibung des Solvers:</h2>
      <p>
        Das GLPK Frontend 1.0 wurde zum L&ouml;sen von gro&szlig;en LP-, MIP-
        (Mixed Integer Programming) und verwandten Problemen entwickelt. Die
        Entwickler legen Wert darauf, dass es sich als Programmbibliothek nutzen
        l&auml;sst. In der Distribution wird aber auch ein
        Standalone-Solverprogramm mitgeliefert.
      </p>
      <p>
        Darstellung von der LP-L&ouml;sung, MIP-L&ouml;sung, Interior Point
        L&ouml;sung und der Sensibilit&auml;tsanalyse.
      </p>
      <p>
        <b>Folgende Dateiformate k&ouml;nnen ge&ouml;ffnet werden:</b>
      </p>
      <ul>
        <li>Fixed MPS Format</li>
        <li>Free MPS Format</li>
        <li>CPLEX LP Format</li>
      </ul>
      <p>
        Au&szlig;erdem lassen sich die Karush-Kuhn-Tucker-Bedingungen (KKT) zur
        Optimalit&auml;t einer L&ouml;sung ausgeben, sowie eine
        Sensibilit&auml;tsanalyse durchf&uuml;hren.
      </p>
      <p>
        <b>Performance:</b>
        <br />
        Grenzen liegen bei 100 Restriktionen und 75 Variablen.
      </p>
    </div>
    <div>
      <!-- <a href="">Zum Solver</a> TODO-->
      <router-link :to="{ path: '/DownloadCenter', hash: '#GLPK' }"
        >Download</router-link
      >
    </div>
  </v-container>
</template>