<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>Sensibilitaetsanalyse</h1>
      <hr noshade size="1" />
      <div class="infoPics">
        <img height="380px" src="@/assets/sensior.jpg" />
      </div>
      <hr noshade size="1" />
      <h2>Beschreibung des Solvers:</h2>
      <p>
        Bei der Sensibilitätsanalyse werden i. allg. Gr&ouml;&szlig;en des
        Ausgangsproblems variiert, und es wird untersucht, welche Wirkung eine
        derartige Modifikation auf die L&ouml;sung eines Problems besitzt. In
        welchem Ma&szlig;e kann man eine Gr&ouml;&szlig;e &auml;ndern, ohne dass
        sich die Änderung auf die wesentlichen Eigenschaften der L&ouml;sung
        auswirkt?
        <br />
        Mit dem Programm SensiOR kann &uuml;ber Sensibilit&auml;tsanalyse die
        Schwankungsbereiche des c- und b-Vektors berechnen werden. Dabei wird
        ein Ausgangstableau eines LP-Ansatzes eingegeben und die optimale
        L&ouml;sung generiert. Auf Basis dieser L&ouml;sung kann eine
        Sensibilit&auml;tsanalyse durchgef&uuml;hrt werden.
      </p>
      <p>
        <b>Nutzungshinweise:</b>
      </p>
      <ul>
        <li>
          Zu beachten ist, dass das Problem mitsamt der Schlupfvariablen
          eingegeben werden muss.
        </li>
        <li>
          Ebenso m&uuml;ssen die Koeffizienten der Zielfunktion mit negativem
          Vorzeichen eingegeben werden. Dies liegt daran, dass der
          Optimierungsalgorithmus auf dem Methodenbankprogramm Iterator basiert.
        </li>
        <li>
          Der L&ouml;sungsalgorithmus l&ouml;st Restriktionen mit
          Kleiner-Gleich-Relationen und nur einer Hilfsvariable pro Restriktion.
        </li>
        <li>
          Bisher ist es nur m&ouml;glich, Restriktionen mit
          kleiner-gleich-Relationen und einer Hilfsvariable pro Restriktion zu
          l&ouml;sen.
        </li>
      </ul>
      <p>
        <b>Performance:</b>
      </p>
      <ul>
        <li>Grenze liegt bei 75 Variablen und 75 Restriktionen.</li>
        <li>
          Die einfachen Standardbeispiele funktionieren. Bei gr&ouml;&szlig;eren
          Berechnungen k&ouml;nnen Fehler passieren.
        </li>
      </ul>
    </div>
    <div>
      <!-- <a href="">Zum Solver</a> TODO-->
      <router-link
        :to="{ path: '/DownloadCenter', hash: '#Sensibilitaetsanalyse' }"
        >Download</router-link
      >
    </div>
  </v-container>
</template>