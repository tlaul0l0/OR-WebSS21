<template>
  <v-container class="spacing-playground pa-6" fluid>
    <div class="content">
      <h1 align="left">Wagner Whitin 1.2</h1>
      <hr noshade size="1" />

      <img src="@/assets/eingabeProPeriode.jpg" height="400px" />
      <hr noshade size="1" />
      <p>
        Dies ist ein Programm, welches optimale Losgr&ouml;&szlig;en f&uuml;r
        Produkte, mit einer immer wieder &auml;ndernden Nachfrage, bei
        einstufiger Fertigung und ohne das Ber&uuml;cksichtigen vorhandener
        Kapazit&auml;ten, errechnet. Das geschieht auf Basis des Wagner Whitin
        Algorithmus.
      </p>
      <ul>
        <p>
          Eingegeben werden k&ouml;nnen die R&uuml;stkosten, die Anzahl der
          Perioden und die Lagerkosten, sowie den Bedarf pro Periode durch einen
          Klick auf den &quot;Weiter&quot;-Button.
        </p>
        <p>
          Klickt man nun auf &quot;Berechnen&quot; so wird das Kostenminimum
          errechnet. Zus&auml;tzlich wird eine Tabelle mit den Perioden, deren
          Bedarfsmengen, deren Bestellmengen, f&uuml;r welche Anzahl von
          Perioden in einer Periode bestellt wird und der Lagerbestand der
          Periode angezeigt.
        </p>
      </ul>
      <p>
        Mehr Informationen zur Funktionsweise des Wagner Whitin Algorithmus,
        finden Sie im Programmordner der Methodendatenbank unter
        \WagnerWhitin\DOC\BESF-WagnerWhitin.docx
      </p>
    </div>
    <div>
      <p><a href="../WagnerWhitinExecute">Zur Methode</a></p>

      <router-link :to="{ path: '/DownloadCenter', hash: '#WagnerWhitin' }"
        >Download</router-link
      >
      <p>{{ msg }}</p>
    </div>
  </v-container>
</template>

<script>
export default {
  data() {
    return {
      msg: "",
    };
  },
  mounted() {
    fetch("http://localhost:8080/api/hello")
      .then((response) => response.text())
      .then((data) => {
        this.msg = data;
      });
  },
};
</script>