#!/bin/sh
cd helidon-se && mvn package && cd -
cd tomee && mvn clean package && cd -