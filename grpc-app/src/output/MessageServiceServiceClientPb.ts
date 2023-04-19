/**
 * @fileoverview gRPC-Web generated client stub for 
 * @enhanceable
 * @public
 */

// Code generated by protoc-gen-grpc-web. DO NOT EDIT.
// versions:
// 	protoc-gen-grpc-web v1.4.1
// 	protoc              v4.22.3
// source: MessageService.proto


/* eslint-disable */
// @ts-nocheck


import * as grpcWeb from 'grpc-web';

import * as MessageService_pb from './MessageService_pb';


export class MessageSenderServiceClient {
  client_: grpcWeb.AbstractClientBase;
  hostname_: string;
  credentials_: null | { [index: string]: string; };
  options_: null | { [index: string]: any; };

  constructor (hostname: string,
               credentials?: null | { [index: string]: string; },
               options?: null | { [index: string]: any; }) {
    if (!options) options = {};
    if (!credentials) credentials = {};
    options['format'] = 'text';

    this.client_ = new grpcWeb.GrpcWebClientBase(options);
    this.hostname_ = hostname.replace(/\/+$/, '');
    this.credentials_ = credentials;
    this.options_ = options;
  }

  methodDescriptorsend = new grpcWeb.MethodDescriptor(
    '/MessageSenderService/send',
    grpcWeb.MethodType.UNARY,
    MessageService_pb.SendRequest,
    MessageService_pb.Response,
    (request: MessageService_pb.SendRequest) => {
      return request.serializeBinary();
    },
    MessageService_pb.Response.deserializeBinary
  );

  send(
    request: MessageService_pb.SendRequest,
    metadata: grpcWeb.Metadata | null): Promise<MessageService_pb.Response>;

  send(
    request: MessageService_pb.SendRequest,
    metadata: grpcWeb.Metadata | null,
    callback: (err: grpcWeb.RpcError,
               response: MessageService_pb.Response) => void): grpcWeb.ClientReadableStream<MessageService_pb.Response>;

  send(
    request: MessageService_pb.SendRequest,
    metadata: grpcWeb.Metadata | null,
    callback?: (err: grpcWeb.RpcError,
               response: MessageService_pb.Response) => void) {
    if (callback !== undefined) {
      return this.client_.rpcCall(
        this.hostname_ +
          '/MessageSenderService/send',
        request,
        metadata || {},
        this.methodDescriptorsend,
        callback);
    }
    return this.client_.unaryCall(
    this.hostname_ +
      '/MessageSenderService/send',
    request,
    metadata || {},
    this.methodDescriptorsend);
  }

}

