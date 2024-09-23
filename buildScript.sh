#!/usr/bin/env bash
set -e

gradle () {
  echo '⚙️ executing gradle'
  chmod +x ./gradlew
  ./gradlew clean
  ./gradlew build -x test
  ./gradlew test
}

main () {
  gradle
}

main "${@}"