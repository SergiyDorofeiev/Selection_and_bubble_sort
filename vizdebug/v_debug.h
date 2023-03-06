#pragma once

#include <QWidget>

class Vizdebug : public QWidget {

public:
    Vizdebug(QWidget *parent = 0);

protected:
//    void mousePressEvent(QMouseEvent *evt)
//    {
//        oldPos = evt->globalPos();
//    }
//
//    void mouseMoveEvent(QMouseEvent *evt)
//    {
//        const QPoint delta = evt->globalPos() - oldPos;
//        move(x()+delta.x(), y()+delta.y());
//        oldPos = evt->globalPos();
//    }

    void mousePressEvent(QMouseEvent *evt)
    {
        offset = evt->pos();
    }

    void mouseMoveEvent(QMouseEvent *event)
    {
        if(event->buttons() & Qt::LeftButton)
        {
            this->move(mapToParent(event->pos() - offset));
        }
    }

private:
    QPoint offset;  // oldPos;
};