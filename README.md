# AvaliacaoTecnicaSAJADVBackend


Requsitos

PostgresSql instalando  no memos host que a aplicação irá rodar.


Criar profile no settings do vamen para as execuções do flyway.

<profile>
   <id>avaliacao_saje_adv</id>
   <properties>
      <flyway.serverId>avaliacao_saje_adv</flyway.serverId>
      <flyway.driver>org.postgresql.Driver</flyway.driver>
      <flyway.user>postgres</flyway.user>
      <flyway.password>postgres</flyway.password>
      <flyway.url>jdbc:postgresql://localhost:5432/avaliacao_saje_adv</flyway.url>
   </properties>
</profile>



Criar Base de dados com script abaixo:

CREATE DATABASE avaliacao_saje_adv
  WITH ENCODING='LATIN1'
       TEMPLATE=template0
       LC_COLLATE='C'
       LC_CTYPE='C'
       CONNECTION LIMIT=-1;