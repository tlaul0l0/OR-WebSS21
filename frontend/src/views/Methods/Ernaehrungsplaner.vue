<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1>Ernaehrungsplaner 2.0</h1>

      <hr noshade size="1" />

      <hr noshade size="1" />
      <div class="infoPics">
        <img src="@/assets/ernaehrungsplaner.jpg" />
      </div>
      <hr noshade size="1" />
      <h2>Beschreibung der Methode:</h2>

      <p>
        Das Programm berechnet aus Größe, Alter, Geschlecht, Gewicht und
        Tätigkeit der Person zuerst den Body-Mass-Index (BMI). Aus dem BMI kann
        abgelesen werden, ob die Person Normalgewicht, Untergewicht oder
        Übergewicht hat. Je nach BMI wird anschließend der Tagesbedarf an
        Kalorien berechnet, der als Input für das LP-Modell dient. Das erzeugte
        LP-Modell berechnet schließlich aus dem Tagesbedarf und den gewählten
        Gerichten die optimale Menüzusammenstellung für einen Tag.
      </p>
      <p>
        <b>Performance:</b> <br />Eine Person von 101cm Größe bis 4m kann
        eingegeben werden. <br />Das Gewicht wurde für die Eingabe von 40-400kg
        getestet. Die Eingabe von 1-99999999 ist bei Gewicht in Kilogramm
        möglich. <br />Das Alter wurde von 8-130 Jahren getestet. Die Berechnung
        von Personen im Alter von 1 bis ca. 250 Jahren ist möglich. Je nach
        Größe und Gewicht kommt ab einem gewissen Alter ein negativer
        Energiebedarf raus. Diese Grenze sollte in der Regel von keinem Menschen
        erreicht werden.
      </p>
    </div>
    <div>
      <!-- <a href="">Zur Methode</a> TODO-->
      <router-link :to="{ path: '/DownloadCenter', hash: '#Ernaehrungsplaner' }"
        >Download</router-link
      >
    </div>
  </v-container>
</template>