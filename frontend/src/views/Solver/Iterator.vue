<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>Iterator 2.0</h1>
      <hr noshade size="1" />
      <div class="infoPics">
        <img src="@/assets/iteratorMainframe.jpg" height="350" width="550" />
      </div>
      <hr noshade size="1" />
      <h2>Beschreibung des Solvers:</h2>
      <p>
        Der Iterator 2.0 erm&ouml;glicht es lineare Modelle mit Hilfe des
        Gauss'schen Eliminationsalgorithmus zu l&ouml;sen. Grundlage
        hierf&uuml;r ist ein Ausgangstableau in Form eines LP-Ansatzes.
        Theoretische und Mathematische Grundlagen siehe Vorlesungsunterlagen -
        Operations Research, Herr Prof. Dr. Gr&uuml;tz, HTWG Konstanz
      </p>
      <p>
        <b>Folgende Grundfunktionen stehen zur Verf&uuml;gung:</b>
      </p>
      <ul>
        <li>
          <b>Pivot: </b>Ermittelt anhand der Pivotspalten- und Zeilenkriterien
          die zu pivotierende Zelle. Diese wird &uuml;ber Auswahl der
          entsprechenden Zelle visualisiert.
        </li>
        <li>
          <b>Iteration: </b>F&uuml;hrt das Gauss'sche Eliminationsverfahren
          f&uuml;r die gew&auml;hlte Zelle aus.
        </li>
        <li>
          <b>Optimierung: </b>Wiederholt f&uuml;hrt die Iteration &uuml;ber
          gefundene Pivotelemente solange aus, bis kein Pivotelement mehr
          gefunden werden kann.
        </li>
      </ul>
      <p>
        <b>Weitere Programmfunktionen:</b>
      </p>
      <ul>
        <li>
          <b>Sprache: </b>Das Programm ist internationalisiert. Die Sprache kann
          &uuml;ber "Settings" (Einstellungen)-> "gew&uuml;nschte Sprache"
          ausgew&auml;hlt werden.
        </li>
        <li>
          <b>Debug: </b>&uuml;ber "Help (Hilfe)"-> "Debug" wird Einblick in die
          internen Programmabl&auml;ufe gew&auml;hrt. Dies soll als St&uuml;tze
          bei der Fehlerbehebung o.&auml;. dienen.
        </li>
        <li>
          <b>Persistierung: </b>Durch die Standardfunktionen (Save, Load) kann
          das gew&auml;hlte Tableau persistiert werden. Als Datentyp f&uuml;r
          die Speicherung des Tableaus wird XML verwendet. Neben der
          erw&auml;hnten XML-Formate k&ouml;nnen auch Dateien im ORI-Format
          (Iterator 1996) geladen werden.
        </li>
      </ul>
      <p><b>Hinweis:</b></p>
      <p>
        Im Verzeichnis des Iterators sind Beispieldateien abgelegt.<br />
        Diese sind &uuml;ber folgenden Pfad erreichbar:<br />
        "C:\Methodenbank\Solver\Interaktive Solver\Iterator\Iterator 2.0\01
        Programm\DATEN"
      </p>
    </div>
    <div>
      <!-- <a href="">Zum Solver</a> TODO-->
      <router-link :to="{ path: '/DownloadCenter', hash: '#Iterator' }"
        >Download</router-link
      >
    </div>
  </v-container>
</template>