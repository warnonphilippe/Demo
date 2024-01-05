#!/bin/sh

echo "The application is starting..."
exec java ${JAVA_OPTS} -noverify -XX:+AlwaysPreTouch -Djava.security.egd=file:/dev/./urandom -cp /app/resources/:/app/classes/:/app/libs/* "be.civatelier.demo.demo.DemoApplication"  "$@"
