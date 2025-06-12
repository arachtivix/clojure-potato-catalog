FROM clojure:temurin-17-lein-trixie-slim

COPY entrypoint.sh /usr/local/entrypoint.sh
RUN cmd chmod +x /usr/local/entrypoint.sh

ENTRYPOINT [ "/usr/local/entrypoint.sh" ]