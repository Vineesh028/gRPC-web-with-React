import { MessageSenderServiceClient } from './output/MessageServiceServiceClientPb.ts';
import { SendRequest } from './output/MessageService_pb';
import React, { useState } from "react";
import './App.css';
function App() {
  const [name, setName] = useState("");
  const [message, setMessage] = useState("");

  const grpcCall = () => {

    let request = new SendRequest();
    request.setName(name);

    const client = new MessageSenderServiceClient('http://localhost:8080')
      .send(request, {}, (err, response) => {


        setMessage(response.getResponsemessage());
        console.log(response.getResponsemessage());

      });


  }


  return (
    <div className="App">
      <header className="App-header">
        <input
          type="text"
          id="message"
          name="message"
          onChange={(e) => {
            setName(e.target.value);
          }}
          value={name}
        />

        <button onClick={grpcCall}> Click me </button>
        <label for="input-id">{message}</label>
      </header>
    </div>
  );
}

export default App;
