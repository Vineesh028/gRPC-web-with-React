import * as jspb from 'google-protobuf'



export class SendRequest extends jspb.Message {
  getName(): string;
  setName(value: string): SendRequest;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): SendRequest.AsObject;
  static toObject(includeInstance: boolean, msg: SendRequest): SendRequest.AsObject;
  static serializeBinaryToWriter(message: SendRequest, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): SendRequest;
  static deserializeBinaryFromReader(message: SendRequest, reader: jspb.BinaryReader): SendRequest;
}

export namespace SendRequest {
  export type AsObject = {
    name: string,
  }
}

export class Response extends jspb.Message {
  getResponsemessage(): string;
  setResponsemessage(value: string): Response;

  getCode(): ResponseCode;
  setCode(value: ResponseCode): Response;

  serializeBinary(): Uint8Array;
  toObject(includeInstance?: boolean): Response.AsObject;
  static toObject(includeInstance: boolean, msg: Response): Response.AsObject;
  static serializeBinaryToWriter(message: Response, writer: jspb.BinaryWriter): void;
  static deserializeBinary(bytes: Uint8Array): Response;
  static deserializeBinaryFromReader(message: Response, reader: jspb.BinaryReader): Response;
}

export namespace Response {
  export type AsObject = {
    responsemessage: string,
    code: ResponseCode,
  }
}

export enum ResponseCode { 
  UNKNOWN = 0,
  SUCCESS = 1,
  FAILED = 2,
}
