cd server
java -Xms2G -Xmx4G -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar paper-1.19.2-307.jar --nogui
cd ..
