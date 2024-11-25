const http = require("http");
const server = http.createServer((req, res) => {
  res.statusCode = 200;
  res.setHeader("content-type", "text");
  res.end("helllo");
});
server.listen("9021", () => {
  console.log("server runnin g on ");
});
