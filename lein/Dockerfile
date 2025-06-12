FROM clojure:leiningen

COPY entrypoint.sh /usr/src/entrypoint.sh
RUN chmod +x /usr/src/entrypoint.sh

ENTRYPOINT [ "/usr/src/entrypoint.sh" ]