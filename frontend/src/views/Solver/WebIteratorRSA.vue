<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>Web-Revidierter Simplex Iterator</h1>
      <hr noshade size="1" />
      <div class="infoPics">
        <img width="500px" src="@/assets/revidierter Web Iterator.png" />
      </div>
      <hr noshade size="1" />
      <h2>Beschreibung des Solvers:</h2>
      <p>
        Der Revidierte Simplex Iterator löst einfache lineare
        Optimierungs-Probleme. Er bietet einen Einblick in die Implementierung
        des Simplex-Algorithmus in kommerziellen Solvern. Der revidierte Simplex
        übertrifft den normalen Simplex in Geschwindigkeit und
        Arbeitspeicher-Auslastung und er ist dafür optimiert lineare Programme
        mit vielen Variablen und wenigen Restriktionen zu lösen.
      </p>
      <p>
        <b>Folgende Grundfunktionen stehen zur Verfügung:</b>
      </p>
      <p>
        <b>Pivot:</b> <br />
        Ermittelt anhand der Pivotspalten- und Zeilenkriterien die zu
        pivotierende Zelle. Diese wird über Auswahl der entsprechenden Zelle
        visualisiert.
      </p>
      <p>
        <b>Iteration:</b> <br />
        Führt das Gauss'sche Eliminationsverfahren für die gewählte Zelle aus.
      </p>
      <p>
        <b>Optimierung:</b> <br />
        Wiederholt führt die Iteration über gefundene Pivotelemente solange aus,
        bis kein Pivotelement mehr gefunden werden kann.
      </p>
    </div>
    <div>
      <!-- <a href="">Zum Solver</a> TODO-->
      <!--<router-link :to="{ path: '/DownloadCenter', hash: '#...'}">Download</router-link> TODO-->
    </div>
  </v-container>
</template>