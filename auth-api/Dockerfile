FROM node:14
WORKDIR .
COPY PACKAGE*.json ./
RUN yarn
COPY . .
EXPOSE 8080
CMD ["node", "app.js"]