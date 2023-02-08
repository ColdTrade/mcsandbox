cd paper
java -Xms2G -Xmx2G -Xdebug -Xnoagent -Djava.compiler=NONE -Xrunjdwp:transport=dt_socket,server=y,suspend=n,address=5005 -jar paper-1.19.2-265.jar --nogui
cd ..
